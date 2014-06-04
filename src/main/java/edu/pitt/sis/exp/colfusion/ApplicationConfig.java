package edu.pitt.sis.exp.colfusion;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

import edu.pitt.sis.exp.colfusion.controllers.OpenRefineController;
import edu.pitt.sis.exp.colfusion.controllers.RelationshipController;
import edu.pitt.sis.exp.colfusion.controllers.StoryController;
import edu.pitt.sis.exp.colfusion.controllers.UserController;
import edu.pitt.sis.exp.colfusion.controllers.WizardController;

public class ApplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();

        // Add your resources.
        resources.add(WizardController.class);
        resources.add(StoryController.class);
        resources.add(UserController.class);
        resources.add(RelationshipController.class);
        resources.add(OpenRefineController.class);
        resources.add(MyResource.class);

        // Add additional features such as support for Multipart.
        resources.add(MultiPartFeature.class);

        return resources;
    }
}