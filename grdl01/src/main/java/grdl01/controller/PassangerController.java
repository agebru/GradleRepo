package grdl01.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import grdl01.Passanger;
import grdl01.PassangerRepository;

@Path("/passangers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PassangerController {

	@GET
	@Path("/psgrs")
	public List<Passanger> getAll() {
		return PassangerRepository.getPassangers();
	}

	@SuppressWarnings("hiding")
	@GET
	@Path("psgrs/{passangerId}")
	public Passanger getone(@PathParam("passangerId") int passangerId) {
		return PassangerRepository.findPassanger(passangerId);
	}

	@DELETE
	@Path("psgrs/{passangerId}")
	public void delete(@PathParam("passangerId") int id) {

		Passanger ps = PassangerRepository.findPassanger(id);
		PassangerRepository.deletePassanger(id);
		
		/*if (null!=PassangerRepository.findPassanger(id) ) {
			System.out.println(PassangerRepository.findPassanger(id).getPassangerName() + " Not deleted");
		}*/
		System.out.println(ps.getPassangerName() + " Deleted..");

	}

	@POST
	@Path("psgrs/addPassanger")
	public void addPassanger(Passanger passanger) {
		PassangerRepository.addPassanger(passanger);
	}

}
