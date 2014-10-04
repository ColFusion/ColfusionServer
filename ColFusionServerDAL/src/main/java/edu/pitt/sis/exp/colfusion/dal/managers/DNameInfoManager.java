/**
 * 
 */
package edu.pitt.sis.exp.colfusion.dal.managers;

import java.util.List;

import edu.pitt.sis.exp.colfusion.dal.orm.ColfusionDnameinfo;
import edu.pitt.sis.exp.colfusion.viewmodels.StoryMetadataHistoryLogRecordViewModel;
import edu.pitt.sis.exp.colfusion.viewmodels.WorksheetViewModel;

/**
 * @author Evgeny
 *
 */
public interface DNameInfoManager extends GeneralManager<ColfusionDnameinfo, Integer> {

	/**
	 * Creates or updates metadata for all variables in a given table/worksheet
	 * 
	 * @param worksheet for which variables metadata need to be created/updated.
	 * @param tableNamePrefix a string to workhseet name
	 */
	void createOrUpdateSheetMetadata(WorksheetViewModel worksheet, String tableNamePrefix, int sid, int userId)  throws Exception;

	//TODO: wrintt a comment
	/**
	 * 
	 * @param sid
	 * @param tableName
	 * @return
	 */
	List<ColfusionDnameinfo> getColumnsMetadata(int sid, String tableName);

	void addColumnMetaEditHistory(int cid, int userid, String editAttribute,
			String reason, String editValue);

	List<StoryMetadataHistoryLogRecordViewModel> getColumnMetaEditHistory(
			int cid, String editAttribute);
	
}
