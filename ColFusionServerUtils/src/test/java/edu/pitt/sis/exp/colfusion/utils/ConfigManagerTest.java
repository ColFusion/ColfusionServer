package edu.pitt.sis.exp.colfusion.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Test functionality of {@link ConfigManager}
 *
 */
public class ConfigManagerTest extends TestCase {

	private static final String COLFUSION_PROPERTIES_SOURCE_VALUE_DEFAULT = "default";
	private static final String COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM = "custom in main";
	private static final String COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM_VIA_SYSTEM_PROPERTY = "custom via system properties";

	private static final String COLFUSION_PROPERTIES_SOURCE_VALUE_TEST_CUSTOM = "test custom properties";
	private static final String COLFUSION_PROPERTIES_SOURCE_VALUE_TEST_DEFAULT = "test default properties";

	Logger logger = LogManager.getLogger(ConfigManagerTest.class.getName());

	public ConfigManagerTest(final String name) {
		super(name);
	}

	/**
	 * Tests {@link ConfigManager#loadDefaultPropertiesFoundInResource(Properties)}
	 */
	@Test
	public void testLoadDefaultPropertiesFoundInResource() {
		final Properties properties = new Properties();

		final ConfigManager configManager = ConfigManager.getInstance();
		configManager.loadProperties(); // Because other tests might have messed up with the properties.
		configManager.loadDefaultPropertiesFoundInResource(properties);

		assertEquals(COLFUSION_PROPERTIES_SOURCE_VALUE_DEFAULT, properties.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE.getKey()));
	}

	/**
	 * Tests {@link ConfigManager#loadCustomPropertiesFoundInResource(Properties)}
	 */
	@Test
	public void testLoadCustomPropertiesFoundInResource() {
		final Properties properties = new Properties();

		final ConfigManager configManager = ConfigManager.getInstance();
		configManager.loadProperties(); // Because other tests might have messed up with the properties.
		configManager.loadCustomPropertiesFoundInResource(properties);

		assertCustomDefaultSourceProperty(configManager);
	}

	/**
	 * Tests {@link ConfigManager#loadCustomPropertiesProvidedViaSystemProperty(Properties)}
	 * @throws IOException
	 */
	@Test
	public void testLoadCustomPropertiesProvidedViaSystemProperty() throws IOException {

		final String testValue = String.format("%s = %s", PropertyKeys.COLFUSION_PROPERTIES_SOURCE.getKey(), COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM_VIA_SYSTEM_PROPERTY);
		final File tempFile = createTestPropertyFile(testValue);

		System.setProperty(PropertyKeys.CONFIG_FILE_NAME_SYSTEM_PROPERTY.getKey(), tempFile.toString());

		final Properties properties = new Properties();

		final ConfigManager configManager = ConfigManager.getInstance(); // Load properties automatically.
		configManager.loadProperties(); // Because other tests might have messed up with the properties.
		configManager.loadCustomPropertiesProvidedViaSystemProperty(properties);

		assertEquals(COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM_VIA_SYSTEM_PROPERTY, properties.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE.getKey()));

		System.clearProperty(PropertyKeys.CONFIG_FILE_NAME_SYSTEM_PROPERTY.getKey()); // cleaning up

		tempFile.delete();
	}

	/**
	 * Tests {@link ConfigManager#loadProperties()} and indirectly {@link ConfigManager#getProperty(String)}
	 * @throws IOException
	 */
	@Test
	public void testLoadProperties() throws IOException {
		final ConfigManager configManager = ConfigManager.getInstance(); // this will also call loadProperties in the ConfigManager
		configManager.loadProperties(); // Because other tests might have messed up with the properties.

		assertCustomDefaultSourceProperty(configManager);

		// Now set system property to the temp config file and call loadProperties manually to reload the properties.

		final String testValue = String.format("%s = %s", PropertyKeys.COLFUSION_PROPERTIES_SOURCE.getKey(), COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM_VIA_SYSTEM_PROPERTY);
		final File tempFile = createTestPropertyFile(testValue);
		System.setProperty(PropertyKeys.CONFIG_FILE_NAME_SYSTEM_PROPERTY.getKey(), tempFile.toString());

		configManager.loadProperties();

		assertEquals(COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM_VIA_SYSTEM_PROPERTY, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE));
		System.clearProperty(PropertyKeys.CONFIG_FILE_NAME_SYSTEM_PROPERTY.getKey()); //cleaning up

		tempFile.delete();
	}

	@Test
	public void testGetProperty() {
		final ConfigManager configManager = ConfigManager.getInstance(); // this will also call loadProperties in the ConfigManager
		configManager.loadProperties(); // Because other tests might have messed up with the properties.

		assertCustomDefaultSourceProperty(configManager);

		// Not existing key
		assertTrue(null == configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_TEST_NEVER_EXISTING_PROPERTY));

		// Not existing key, but a default value is provided.
		final String defalutValue = "default value for not existing property";
		assertEquals(defalutValue, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_TEST_NEVER_EXISTING_PROPERTY, defalutValue));

		final String propertyValueViaSystemProperties = "this value should be returned";

		// A system property provided to JSV outside of any property file
		// and that property was never read from any other properties file
		System.setProperty(PropertyKeys.COLFUSION_PROPERTIES_TEST_NEVER_EXISTING_PROPERTY.getKey(), propertyValueViaSystemProperties);

		assertEquals(propertyValueViaSystemProperties, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_TEST_NEVER_EXISTING_PROPERTY));
		System.clearProperty(PropertyKeys.COLFUSION_PROPERTIES_TEST_NEVER_EXISTING_PROPERTY.getKey()); // cleaning up

		// A system property provided to JVM outside of any property file
		// The property should override property with the same name but loaded form any file.
		System.setProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE.getKey(), propertyValueViaSystemProperties);

		assertEquals(propertyValueViaSystemProperties, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE));
		System.clearProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE.getKey()); // cleaning up
	}

	/**
	 * @param configManager
	 */
	private void assertCustomDefaultSourceProperty(final ConfigManager configManager) {
		if (ResourceUtils.resourceExists(configManager.getClass(), ConfigManager.CONFIG_FILE_NAME)) {
			// Since the custom config.properties file is present in the src/test/resources then
			// the default PropertyKeys.COLFUSION_PROPERTIES_SORUCE property should be overridden

			assertEquals("Wrong source in custom property file",
					COLFUSION_PROPERTIES_SOURCE_VALUE_CUSTOM, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE));
		}
		else {
			assertEquals("Wrong source in custom property file",
					COLFUSION_PROPERTIES_SOURCE_VALUE_DEFAULT, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE));
		}
	}

	/**
	 * Creates temporary file and writes a given string into it.
	 *
	 * @param value
	 * 		The String value to write to the file.
	 * @return
	 * 		The temporary file.
	 * @throws IOException
	 */
	private File createTestPropertyFile(final String value) throws IOException {
		final File tempFile = File.createTempFile("colfusion_ConfigManagerTest", ".properties");

		final Writer writer = new FileWriter(tempFile);
		writer.write(value);
		writer.flush();
		writer.close();
		return tempFile;
	}

	@Test
	public void testLoadTestProperties() {
		final ConfigManager configManager = ConfigManager.getInstance();
		configManager.loadTestProperties();


		if (ResourceUtils.resourceExists(configManager.getClass(), ConfigManager.CONFIG_TEST_FILE_NAME)) {
			// Since the custom config.properties file is present in the src/test/resources then
			// the default PropertyKeys.COLFUSION_PROPERTIES_SORUCE property should be overridden

			assertEquals("Wrong source in custom property file",
					COLFUSION_PROPERTIES_SOURCE_VALUE_TEST_CUSTOM, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE));
		}
		else {
			assertEquals("Wrong source in custom property file",
					COLFUSION_PROPERTIES_SOURCE_VALUE_TEST_DEFAULT, configManager.getProperty(PropertyKeys.COLFUSION_PROPERTIES_SOURCE));
		}
	}
}
