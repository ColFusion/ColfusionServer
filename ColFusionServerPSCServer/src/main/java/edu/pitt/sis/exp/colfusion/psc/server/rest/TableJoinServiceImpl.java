/**
 * 
 */
package edu.pitt.sis.exp.colfusion.psc.server.rest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.pitt.sis.exp.colfusion.bll.BasicTableBL;
import edu.pitt.sis.exp.colfusion.bll.JoinTablesBL;
import edu.pitt.sis.exp.colfusion.dal.dataModels.relationships.Relationship;
import edu.pitt.sis.exp.colfusion.dal.dataModels.relationships.RelationshipLink;
import edu.pitt.sis.exp.colfusion.dal.dataModels.relationships.transformation.RelationshipTransofmationUtil;
import edu.pitt.sis.exp.colfusion.dal.dataModels.tableDataModel.Table;
import edu.pitt.sis.exp.colfusion.dal.managers.RelationshipsManager;
import edu.pitt.sis.exp.colfusion.dal.managers.RelationshipsManagerImpl;
import edu.pitt.sis.exp.colfusion.dal.orm.ColfusionRelationships;
import edu.pitt.sis.exp.colfusion.dal.orm.ColfusionRelationshipsColumns;
import edu.pitt.sis.exp.colfusion.dal.viewmodels.TwoJointTablesViewModel;
import edu.pitt.sis.exp.colfusion.dal.viewmodels.TwoTableJoinInputViewModel;
import edu.pitt.sis.exp.colfusion.psc.server.util.ServerType;
import edu.pitt.sis.exp.colfusion.psc.server.util.Utils;
import edu.pitt.sis.exp.colfusion.responseModels.JointTableByRelationshipsResponeModel;
import edu.pitt.sis.exp.colfusion.utils.Gsonizer;
import edu.pitt.sis.exp.colfusion.utils.IOUtils;
import edu.pitt.sis.exp.colfusion.utils.models.IOUtilsStoredFileInfoModel;

/**
 * @author Evgeny
 *
 */
@Path("TableJoin/")
public class TableJoinServiceImpl implements TableJoinService {

	private static final Logger logger = LogManager.getLogger(TableJoinServiceImpl.class.getName());
	
	@Override
	public Response joinTables(final String twoJointTables) throws FileNotFoundException, IOException {
		
		logger.info("Got request with this payload length: " + twoJointTables.length());
		
//		Gsonizer.registerTypeAdapter(Cell.class, new CellDeserializer());
//		
//		TypeAdapter<Cell> ta = Gsonizer.getTypeAdapter(Cell.class);
//		
//		logger.info("TA for Cell " + ta.toString());
		
		TwoTableJoinInputViewModel model = Gsonizer.fromJson(twoJointTables, TwoTableJoinInputViewModel.class, true);
		
		JoinTablesBL joinBL = new JoinTablesBL();
		
		for (double i = 0; i<= 1; i += 0.1) {
			model.getTwoJointTables().setSimilarityThreshold(Double.parseDouble(new DecimalFormat("#.###").format(i)));
			TwoJointTablesViewModel result = joinBL.joinTables(model);
			
			TwoTableJoinInputViewModel modelToSave = new TwoTableJoinInputViewModel();
			modelToSave.setRelationships(model.getRelationships());
			modelToSave.setTwoJointTables(result);
			
			IOUtilsStoredFileInfoModel file = IOUtils.writeToFile(Gsonizer.toJson(modelToSave, true), model.getIdentifyingString());
			logger.info(file.getAbsoluteFileName());
		}
		
		return Response.status(200).entity("test2").build();
	}

	@Override
	public Response joinTables(final int sid1, final String tableName1, final int sid2,
			final String tableName2, final double similarityThreshold) throws Exception {
		
		logger.info(String.format("Got: %d %s %d %s %f", sid1, tableName1, sid2, tableName2, similarityThreshold));
		
		BasicTableBL tablBL = new BasicTableBL();
		
		JointTableByRelationshipsResponeModel tableResponse1 = tablBL.getTableDataBySidAndName(sid1, tableName1);
		
		if (tableResponse1 ==  null) {
			logger.info("joinTables: tableResponse1 is Null");
			return Response.status(200).entity("tableResponse1 is Null").build();
		}
		
		if (tableResponse1.getPayload() ==  null) {
			logger.info("joinTables: tableResponse1.getPayload() is Null");
			return Response.status(200).entity("tableResponse1.getPayload() is Null").build();
		}
		
		Table table1 = tableResponse1.getPayload().getJointTable();
		
		JointTableByRelationshipsResponeModel tableResponse2 = tablBL.getTableDataBySidAndName(sid2, tableName2);
		
		if (tableResponse2 ==  null) {
			logger.info("joinTables: tableResponse2 is Null");
			return Response.status(200).entity("tableResponse2 is Null").build();
		}
		
		if (tableResponse2.getPayload() ==  null) {
			logger.info("joinTables: tableResponse2.getPayload() is Null");
			return Response.status(200).entity("tableResponse2.getPayload() is Null").build();
		}
		
		Table table2 = tableResponse2.getPayload().getJointTable();
		
		TwoJointTablesViewModel twoJointTables = new TwoJointTablesViewModel(sid1, tableName1, sid2, tableName2, similarityThreshold, null);
		
		RelationshipsManager relMng = new RelationshipsManagerImpl();
		List<ColfusionRelationships> dbRelationships = relMng.findRelationshipsBySid(sid1, sid2);
		
		List<Relationship> relationships = new ArrayList<Relationship>();
		List<RelationshipLink> links = new ArrayList<RelationshipLink>();
		
		for (ColfusionRelationships dbRelationship : dbRelationships) {
			
			for (Object relColumnOBj : dbRelationship.getColfusionRelationshipsColumnses().toArray()) {
				ColfusionRelationshipsColumns colfusionLink = (ColfusionRelationshipsColumns) relColumnOBj;
				links.add(new RelationshipLink(RelationshipTransofmationUtil.makeRelationshipTransformation(dbRelationship.getRelId(), colfusionLink.getId().getClFrom()), 
						RelationshipTransofmationUtil.makeRelationshipTransformation(dbRelationship.getRelId(), colfusionLink.getId().getClTo())));
			}
			
			Relationship relationship = new Relationship(dbRelationship.getRelId(), dbRelationship.getColfusionSourceinfoBySid1().getSid(), dbRelationship.getTableName1(), 
					dbRelationship.getColfusionSourceinfoBySid2().getSid(), dbRelationship.getTableName2(), links);
			
			relationships.add(relationship);
		}
		
		TwoTableJoinInputViewModel twoTables = new TwoTableJoinInputViewModel(table1,  table2, twoJointTables, relationships);
		
		String twoTablesStr = Gsonizer.toJson(twoTables, true);
		
		logger.info("Serialized model length is: " + twoTablesStr.length());

		String resourceURL = String.format("%s/TableJoin/join", Utils.getBaseRestURL(ServerType.JOINER));
		   
		logger.info(String.format("About to do POST request to '%s' resource. The body lenght is %d", resourceURL, twoTablesStr.length()));
		
		Response response = Utils.doPost(resourceURL, twoTablesStr);
		
		return Response.status(response.getStatus()).entity(response.getEntity().toString()).build();
	}

	@Override
	public Response isJoinerAlive() {
		
		logger.info("Got request 'isJoinerAlive'");
		
		String resourceURL = String.format("%s/TableJoin/isAlive", Utils.getBaseRestURL(ServerType.JOINER));
		Response response = Utils.doGet(resourceURL);
		
		logger.info("Got this response (toString): " + response.toString());
		
		return Response.status(response.getStatus()).entity(response.toString()).build();
	}

	@Override
	public Response isAlive() {
		logger.info("Got reques 'isAlive'");
		
		return Response.status(200).entity("OK").build();
	}
}
