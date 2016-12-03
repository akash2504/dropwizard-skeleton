import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by akash.bansal on 02/12/16.
 */
public class SampleApplication extends Application<SampleConfiguration> {

  @Override public void run(SampleConfiguration sampleConfiguration, Environment environment)
      throws Exception {
    final SampleResource resource = new SampleResource(sampleConfiguration.getDefaultName());
    environment.jersey().register(resource);
  }
  @Override
  public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
    // nothing to do yet
  }
  public static void main(String[] args) throws Exception {
    new SampleApplication().run(args);
  }
}
