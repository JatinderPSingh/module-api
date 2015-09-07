package restaurant.reservation.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import restaurant.reservation.exception.AppException;
import restaurant.reservation.model.Customer;
import restaurant.reservation.util.DBUtils;

public class CustomerDAO {

public List<Customer> getALLCustomers()throws AppException{
List<Customer>customers=new ArrayList<Customer>();


 Connection conn =DBUtils.connect();
 PreparedStatement ps=null;
 ResultSet rs=null;
 try {
	ps=conn.prepareStatement("Select * from customers");
	rs=ps.executeQuery();
	while(rs.next()){
		Customer cust=new Customer();
		cust.setId(rs.getInt("id"));
	cust.setFirst_Name(rs.getString("first_name"));
	cust.setLast_Name(rs.getString("last_name"));
	cust.setAddress1(rs.getString("address1"));
	cust.setAddress2(rs.getString("address2"));
	cust.setEmail(rs.getString("email"));
	cust.setPhone(rs.getString("phone"));
	cust.setCity(rs.getString("city"));
	cust.setState(rs.getString("state"));
	cust.setZip(rs.getInt("zip"));
customers.add(cust);}} 
 catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	throw new AppException(e.getMessage(),e.getCause());
}
return customers ;
}
public void getById()
{
	CustomerDAO dao=new Customer DAO() {
		return null;
	
	Customer cust=dao.getOne(1002);

}
public Customer getOne(int id)throws AppException{
	Customer cust=null;
	List<Customer>customers=new ArrayList<Customer>();
Connection conn=DBUtils.connect();
PreparedStatement ps=null;
ResultSet rs=null;
try{
	ps=prepareSatement("Select * from customer WHERE id=?");
	ps.setInt(1,id);
	rs=ps.executeQuery();
	while(rs.next()){
	Customer cust=new Customer();
	cust.setId(rs.getInt("id"));
	cust.setFirst_Name(rs.getString("first_Name"));
	cust.setLast_Name(rs.getString("last_Name"));
	cust.setEmail(rs.getString("email"));
	cust.setAddress1(rs.getString("address1"));
	cust.setAddress2(rs.getString("address2"));
	cust.setCity(rs.getString("city"));
	cust.setState(rs.getString("state"));
	cust.setPhone(rs.getString("phone"));
	cust.setZip(rs.getInt("zip"));
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new AppException(e.getMessage(),e.getCause());
	
	
	customers.add(cust);
	}

	}
}

private PreparedStatement prepareSatement(String string) {
	// TODO Auto-generated method stub
	return null;
}