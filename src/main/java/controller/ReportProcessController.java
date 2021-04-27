package main.java.controller;

import main.java.services.ConvertOperationReportService;
import main.java.services.ConvertTransactionReportService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/reportProcess")
public class ReportProcessController {

	ConvertTransactionReportService transactionReport = new ConvertTransactionReportService();
	ConvertOperationReportService operationReport = new ConvertOperationReportService();
	
	@GET
	@Path("/transactionReport")
	public Response getTransactionReportProcess() throws Exception {

		transactionReport.processReport();
		
		String result = "Report files processed successfully";

		return Response.status(200).entity(result).build();

	}

	@GET
	@Path("/operationReport")
	public Response getOperationReportProcess() throws Exception {

		operationReport.processReport();

		String result = "Report files processed successfully";

		return Response.status(200).entity(result).build();

	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloWorld() {
		return "File Processing Application!";
	}

}