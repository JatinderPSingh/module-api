package restaurant.reservation.app;
import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
@ApplicationPath("/api")
public class RESTApplication extends ResourceConfig{
	public RESTApplication(){
packages("restaurant.reservation.rest");

	BeanConfig beanConfig = new BeanConfig();
    beanConfig.setVersion("1.0.2");
    beanConfig.setSchemes(new String[]{"http"});
    beanConfig.setHost("localhost:8080");
    beanConfig.setBasePath("RESTApi/api");
    beanConfig.setResourcePackage("io.swagger.resources");
    beanConfig.setTitle("RESTApi Documentation");
    beanConfig.setDescription("Rest Api for the Project");
    register(io.swagger.jaxrs.listing.ApiListingResource.class);
    register(io.swagger.jaxrs.listing.SwaggerSerializers.class);


    beanConfig.setScan(true);
	}} 