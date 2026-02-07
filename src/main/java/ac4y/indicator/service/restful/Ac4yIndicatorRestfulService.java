package ac4y.indicator.service.restful;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import ac4y.base.Ac4yException;
import ac4y.indicator.service.object.Ac4yIndicatorObjectService;
import ac4y.indicator.service.object.analytics.AnalyticsByHumanIDsRequest;
import ac4y.indicator.service.object.analytics.AnalyticsRequest;
import ac4y.indicator.service.object.transfer.TransferRequest;

@Path("")
public class Ac4yIndicatorRestfulService {

	public Ac4yIndicatorRestfulService() {
	}

	@GET
	@Path("/analytics")
	@Produces(MediaType.APPLICATION_JSON)
	public Response analytics(@QueryParam("request") String request) throws Ac4yException, JAXBException {
		
		return 
			Response
			   .status(200)
			   .entity(
					new Ac4yIndicatorObjectService().analytics(
					   	(AnalyticsRequest) new AnalyticsRequest().getFromJson(request)
					).getAsJson()
					   
			   )
			   .build();
		
	} // analytics
	
	@GET
	@Path("/analyticsByHumanIDs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response analyticsByHumanIDs(@QueryParam("request") String request) throws Ac4yException, JAXBException {
		
		return 
			Response
			   .status(200)
			   .entity(
					new Ac4yIndicatorObjectService().analyticsByHumanIDs(
					   	(AnalyticsByHumanIDsRequest) new AnalyticsByHumanIDsRequest().getFromJson(request)
					).getAsJson()
					   
			   )
			   .build();
		
	} // analyticsByHumanIDs

	@POST
	@Path("/transfer")
	@Produces(MediaType.APPLICATION_JSON)
	public Response transfer(String request) throws Ac4yException, JAXBException {
		System.out.println(request);
		return 
			Response
			   .status(200)
			   .entity(
					new Ac4yIndicatorObjectService().transfer(
					   	(TransferRequest) new TransferRequest().getFromJson(request)
					).getAsJson()
					   
			   )
			   .build();
		
	} // transfer
/*
	public Response transfer(@QueryParam("request") String request) throws Ac4yException {
		
		return 
			Response
			   .status(200)
			   .entity(
					new Ac4yIndicatorObjectService().transfer(
					   	(TransferRequest) new TransferRequest().getFromJson(request)
					).getAsJson()
					   
			   )
			   .build();
		
	} // transfer

*/		

}