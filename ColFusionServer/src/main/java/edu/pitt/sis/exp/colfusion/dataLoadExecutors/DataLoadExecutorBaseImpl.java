/**
 * 
 */
package edu.pitt.sis.exp.colfusion.dataLoadExecutors;

import com.google.gson.annotations.Expose;

import edu.pitt.sis.exp.colfusion.ConfigManager;
import edu.pitt.sis.exp.colfusion.PropertyKeys;
import edu.pitt.sis.exp.colfusion.persistence.databaseHandlers.LinkedServerHandler;
import edu.pitt.sis.exp.colfusion.persistence.managers.ExecutionInfoManager;
import edu.pitt.sis.exp.colfusion.persistence.managers.SourceInfoManager;
import edu.pitt.sis.exp.colfusion.persistence.managers.SourceInfoManagerImpl;
import edu.pitt.sis.exp.colfusion.process.ProcessBase;
import edu.pitt.sis.exp.colfusion.viewmodels.StoryTargetDBViewModel;

/**
 * All executors should inherit from this class and run this class execute method as the first instruction in their execute method.
 * 
 * @author Evgeny
 *
 */
public abstract class DataLoadExecutorBaseImpl extends ProcessBase implements DataLoadExecutor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8124562049915428600L;
	
	@Expose protected int sid;

	/**
	 * Updates/inserts record about target database (the database where the data should be loaded).
	 * @param executionLogId 
	 * @param executionInfoMgr 
	 * 
	 * @param sourceDBInfo the info about target database.
	 * @throws Exception 
	 */
	protected void updateSourceDBInfo(final ExecutionInfoManager executionInfoMgr, final int executionLogId, final StoryTargetDBViewModel sourceDBInfo) throws Exception {
		
		executionInfoMgr.appendLog(executionLogId, String.format("Starting to update sourceintoDB record with target database conneciton info : %s ", 
				sourceDBInfo.toString()));
		
		SourceInfoManager storyMgr = new SourceInfoManagerImpl();
		
		storyMgr.saveOrUpdateSourceInfoDB(sourceDBInfo);
		
		executionInfoMgr.appendLog(executionLogId, "Finished update sourceintoDB record with target database conneciton info");
	}
	
	/**
	 * Creates or updates Linked server for the given target database.
	 * @param executionInfoMgr execution info manager that will be used to log the progress/log message.
	 * @param executionLogId the id of the execution info record where log should be recorded.
	 * @param sourceDBInfo target database connection info.
	 * @throws Exception
	 */
	protected void updateLinkedServer(final ExecutionInfoManager executionInfoMgr, final int executionLogId, final StoryTargetDBViewModel sourceDBInfo) throws Exception {
		
		executionInfoMgr.appendLog(executionLogId, String.format("Starting to update Linked Server with target database conneciton info : %s ", 
				sourceDBInfo.toString()));
		
		LinkedServerHandler linkedServerHandler = null;
		
		try {
			
			ConfigManager configManager = ConfigManager.getInstance();
			
			linkedServerHandler = new LinkedServerHandler(configManager.getPropertyByName(PropertyKeys.linkedServerServer), 
					Integer.valueOf(configManager.getPropertyByName(PropertyKeys.linkedServerPort)), 
					configManager.getPropertyByName(PropertyKeys.linkedServerUserName), 
					configManager.getPropertyByName(PropertyKeys.linkedServerPassword), 
					configManager.getPropertyByName(PropertyKeys.linkedServerDatabaseName),
					executionInfoMgr, executionLogId);
			
			linkedServerHandler.addOrUpdateLinkedServer(sourceDBInfo);
			
		} catch (Exception e) {
			//TODO: throw proper exception
			
			throw e;
		}
		finally {
			linkedServerHandler.close();
		}
				
		executionInfoMgr.appendLog(executionLogId, "Finished update Linked Server with target database conneciton info");
	}
	
	@Override
	public void setSid(final int sid) {
		this.sid = sid;
	}
	
	@Override
	public int getSid() {
		return this.sid;
	}
}
