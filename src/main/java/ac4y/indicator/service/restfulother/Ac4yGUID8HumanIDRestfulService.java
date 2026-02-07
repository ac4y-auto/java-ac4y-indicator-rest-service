package ac4y.indicator.service.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import ac4y.guid8humanid.service.object.Ac4yGUID8HumanIdObjectService;
import ac4y.guid8humanid.service.object.get.*;
import ac4y.guid8humanid.service.object.set.SetByHumanIdsRequest;

@Path("")
public class Ac4yIndicatorRestServiceOnTheFly {
	
	public Ac4yIndicatorRestServiceOnTheFly() {
	}
		
	@GET
	@Path("/setByHumanIDs")
	@Produces(MediaType.APPLICATION_JSON)
	public Response setByHumanIDs(@QueryParam("request") String request) throws JAXBException {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					new Ac4yGUID8HumanIdObjectService().setByHumanIds(
					   		(SetByHumanIdsRequest) new SetByHumanIdsRequest().getFromJson(request)
					).getAsJson()
					   
			   )
			   .build();
		
	} // setByHumanIDs

} // Ac4yIndicatorRestServiceOnTheFly