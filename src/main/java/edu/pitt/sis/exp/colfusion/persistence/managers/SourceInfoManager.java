/**
 * 
 */
package edu.pitt.sis.exp.colfusion.persistence.managers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import edu.pitt.sis.exp.colfusion.persistence.orm.ColfusionSourceinfo;
import edu.pitt.sis.exp.colfusion.persistence.orm.ColfusionUserroles;
import edu.pitt.sis.exp.colfusion.viewmodels.StoryMetadataViewModel;

/**
 * @author Evgeny
 *
 */
public interface SourceInfoManager extends GeneralManager<ColfusionSourceinfo, Integer> {
	
    /**
	 * 
	 * Finds all datasets (source infos) which were submitted by given userid.
	 * 
	 * @param userId by which the search should be performed.
	 * @return all found datasets which conform to the search criteria. 
	 */
	public List<ColfusionSourceinfo> findByUserId(int userId);
	
	/**
	 * Finds all datasets (source infos) by either source id (sid) or by a keywords/phrase in dataset title.
	 * 
	 * @param searchTerm could be either dataset id (sid) or keyword/phrase which should be contained in the dataset title.
	 * @return all found datasets which conform to the search criteria. 
	 */
	public List<ColfusionSourceinfo> findBySidOrTitle(String searchTerm);
	
	/**
	 * Find one dataset or none by dataset id (sid).
	 * 
	 * @param sid the id of the dataset to search for.
	 * @param includeDraft indicates whether a draft dataset be returned or not.
	 * @return all found datasets which conform to the search criteria. 
	 */
	public ColfusionSourceinfo findBySid(int sid, boolean includeDraft);
	
	/**
	 * Finds all datasets that have title containing given search term as a keyword/phrase.
	 * 
	 * @param searchTerm to search to be contained in the datasets title.
	 * @return all found datasets which conform to the search criteria. 
	 */
	public List<ColfusionSourceinfo> findByTitle(String searchTerm);

	/**
	 * Creates new story with given input parameters and stores it in the database and the resulting entity has automatically generated sid.
	 * 
	 * @param userId is the id of the user who is creating the new story.
	 * @param date when the new story is created.
	 * @param source_type type of the source from which the data will be imported.
	 * @return newly created story which is stored in the db. Has auto generated sid.
	 */
	public ColfusionSourceinfo newStory(int userId, Date date, String source_type);

	/**
	 * Updates both sourceinfo and links table with story metadata.
	 * 
	 * @param metadata the metadata to be used to update the tables in database.
	 */
	public void updateStory(StoryMetadataViewModel metadata);

	/**
	 * Transforms referenced field ColfusionSourceinfoUsers of a given story into map where keys are user ids and values are records from StoryUserRoles table which
	 * describes in which role each user is participating in the given story.
	 * 
	 * @param newStory for which the information need to be transformed.
	 * @return the map as described in the description. They key is UserId and the value is ColfusionUserroles.
	 */
	public Map<Integer, ColfusionUserroles> getUsersInRolesForStory(ColfusionSourceinfo newStory);
}