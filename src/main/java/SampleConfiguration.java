import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by akash.bansal on 02/12/16.
 */
public class SampleConfiguration extends Configuration {
  @NotEmpty
  private String defaultName = "Akash";

  @JsonProperty
  public String getDefaultName() {
    return defaultName;
  }
}
