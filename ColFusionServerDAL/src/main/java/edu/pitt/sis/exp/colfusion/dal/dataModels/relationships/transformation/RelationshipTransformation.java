package edu.pitt.sis.exp.colfusion.dal.dataModels.relationships.transformation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.annotations.Expose;

import edu.pitt.sis.exp.colfusion.dal.dataModels.tableDataModel.ColumnMetadata;
import edu.pitt.sis.exp.colfusion.dal.dataModels.tableDataModel.RelationKey;

public class RelationshipTransformation {
	
	static Logger logger = LogManager.getLogger(RelationshipTransformation.class.getName());
	
	@Expose private final String transformationInCids;
	
//	private final List<Integer> cids;
	
	@Expose private final List<ColumnMetadata> columnsMetadata;
	//private final List<ColfusionDnameinfo> columns;
	
	@Expose private final RelationKey relationKey;
	@Expose private final int sid;
	
	public RelationshipTransformation(final String transformationInCids, final int sid, final RelationKey relationKey, final List<ColumnMetadata> columnsMetadata) throws Exception {
		
		if (transformationInCids.length() == 0) {
			logger.error(String.format("Fail to initialize RelationshipTransformation because transformationInCids parameter has length 0."));
			throw new IllegalArgumentException("transformationInCids parameter cannot be empty.");
		}
		
		this.transformationInCids = transformationInCids;
		this.sid = sid;
		this.relationKey = relationKey;
	
		this.columnsMetadata = columnsMetadata;
		
//		cids = TransofmationCidsExtractor.extractCids(transformationInCids);
		
//		columns = new ArrayList<>();
		
//		extractConnectionInfoAndColumnNames();
	}

//	private void extractConnectionInfoAndColumnNames() throws Exception {
//		if (cids.size() == 0) {
//			throw new RuntimeException("Cannot get columns names from empty array of cids.");
//		}
//		
//		SourceInfoManager sourceInfoMng = new SourceInfoManagerImpl();
//		DNameInfoManager columnManager = new DNameInfoManagerImpl();
//		
//		ColfusionSourceinfo storyTemp = null;
//		
//		for (int i = 0; i < cids.size(); i++) {
//			storyTemp = sourceInfoMng.findStoryByCid(cids.get(i));
//			
//			if (i == 0) {
//				story = GeneralManagerImpl.initializeField(storyTemp, "colfusionSourceinfoDb");
//			} else {
//				if (storyTemp.getSid() != story.getSid()) {
//					String msg = String.format("Found cids from more than one story (%d and %d). "
//							+ "Transformation should have columns only from one story and one table.", story.getSid(), storyTemp.getSid());
//					logger.error(msg);
//					
//					throw new RuntimeException(msg);
//				}
//			}
//		
//			ColfusionDnameinfo column = null;
//			
//			column = columnManager.findByID(cids.get(i));
//			
//			column = GeneralManagerImpl.initializeField(column, "colfusionColumnTableInfo");
//			
//			if (i == 0) {
//				tableName = column.getColfusionColumnTableInfo().getTableName();
//			} else {
//				if (!column.getColfusionColumnTableInfo().getTableName().equalsIgnoreCase(tableName)) {
//					String msg = String.format("Found cids from more than one table (%s and %s). "
//							+ "Transformation should have columns only from one story and one table.", 
//							tableName, column.getColfusionColumnTableInfo().getTableName());
//					logger.error(msg);
//					throw new RuntimeException(msg);
//				}
//			}
//			
//			columns.add(column);
//		}
//	}

	public RelationKey getRelationKey() {
		return relationKey;
	}
	
	public String getTransformation() {
		return transformationInCids;
	}
	
	/**
	 * Return the list of column names used in this transformation. The names are original names in the target database.
	 * @return
	 */
	public List<String> getColumnDbNames() {
		List<String> columnDbNames = new ArrayList<>();
		
		for (ColumnMetadata column : columnsMetadata) {
			columnDbNames.add(column.getOriginalName());
		}
		
		return columnDbNames;
	}
	
	@Override
	public boolean equals(final Object other) {
		
		if (other instanceof RelationshipTransformation) {
			RelationshipTransformation typedOther = (RelationshipTransformation) other;
			
			return this.transformationInCids.equals(typedOther.getTransformation());
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return transformationInCids;
	}
}
