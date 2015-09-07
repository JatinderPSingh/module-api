package restaurant.reservation.rest;
import restaurant.reservation.dao.CustomerDAO;
import restaurant.reservation.exception.AppException;
import restaurant.reservation.model.Customer;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/customer")
@Api(tags={"customer"})
public class CustomerController {
@GET

	@Path("/all")
@Produces(MediaType.APPLICATION_JSON)
	//CREATE
@ApiOperation(value="Find all Customers",
notes="Find all customers in the database")
@ApiResponses(value={@ApiResponse(code=200 message="success")
(code=500 message="Internal Server Error")
})
	public List<Customer> getAll1(){
	List<Customer>customers=null;
	try{
	
	CustomerDAO dao=new CustomerDAO();
	customers=dao.getALLCustomers();
	
}
	catch(AppException e){
	e.printStackTrace();
	throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);
}
	return customers;
}


	@Get
@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="Find all Customers",
	notes="Find all customers in the database")
	@ApiResponses(value={@ApiResponse(code= 200, message="success"),
	(code=500, message="Internal Server Error"),
	})
	public Customer getById(@PathParam("id")int custid){
		Customer cust;
	public Void getById(){
	

	try{
		CustomerDAO dao=new CustomerDAO();
		
		cust=dao.getOne(custid);
	}
	catch(AppException e){
		e.printStackTrace();
		throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);
	}
return cust	}
	public List<Customer> getAll(){
	List<Customer>customers=null;
	try{
	
	CustomerDAO dao=new CustomerDAO();
	customers=dao.getALLCustomers();
	
}
	catch(AppException e){
	e.printStackTrace();
	throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);
}
	return customers;
}
	public void getbyId(){CustomerDAO dao=new CustomerDAO();
	Customer cust=dao.getOne(1001);
	//READ
	}catch (AppException e){
		e.printStackTrace();
		throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);}
	}
	public void createOne(){
	//UPDATE
	}	public void updateOne(){
	//DELETE
	}		public void deleteOne(){}
}