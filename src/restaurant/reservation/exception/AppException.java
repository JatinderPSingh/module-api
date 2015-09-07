package restaurant.reservation.exception;

public class AppException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 3694519011855848413L;
public AppException(){
	
}
public AppException(String msg){
super(msg);
}public AppException(String msg,Throwable cause)
{
	super(msg,cause);
}}
