import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by akash.bansal on 03/12/16.
 */
public class SampleResponse {
  private String content;
  public SampleResponse(String content){
    this.content = content;
  }
  @JsonProperty
  public String getContent() {
    return content;
  }

}

