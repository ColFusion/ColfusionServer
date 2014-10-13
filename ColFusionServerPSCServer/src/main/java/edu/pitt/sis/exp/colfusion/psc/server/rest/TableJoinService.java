package edu.pitt.sis.exp.colfusion.psc.server.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.pitt.sis.exp.colfusion.dal.viewmodels.TwoJointTablesViewModel;

public interface TableJoinService {
	
	@Path("join/{sid1}/{tableName1}/{sid2}/{tableName2}/{similarityThreshold}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public abstract Response joinTables(@PathParam("sid1") int sid1, @PathParam("tableName1") String tableName1, 
			@PathParam("sid2") int sid2, @PathParam("tableName2") String tableName2, @PathParam("similarityThreshold") double similarityThreshold);
	
	@Path("join")
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public abstract Response joinTables(TwoJointTablesViewModel twoJointTables);
}