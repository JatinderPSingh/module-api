package restaurant.reservation.util;
import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;
@ApplicationPath("/api")
public class RESTApplication extends ResourceConfig{
	public RESTApplication(){
packages("restaurant.reservation.rest");
}
}