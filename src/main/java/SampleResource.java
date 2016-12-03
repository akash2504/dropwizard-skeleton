import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by akash.bansal on 02/12/16.
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
  private final String defaultName;

  public SampleResource(String defaultName){
    this.defaultName = defaultName;
  }
  @GET
  @Path("/")
  @Timed
  public SampleResponse sayHello(@QueryParam("name") Optional<String> name) {
    final String value = String.format(defaultName);
    return new SampleResponse(value);
  }
}
