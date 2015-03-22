package ec.com.se.demo2015.inventarios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/inventarios")
public interface InventariosResource {
	
	@GET
	@Path("/productos")
	@Produces({ "application/json" })
	Response getProducts();

}
