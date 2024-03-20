/* (C) 2024 */
package ambovombe.kombarika.configuration.main;

import ambovombe.kombarika.configuration.Configuration;
import ambovombe.kombarika.configuration.mapping.FrameworkProperties;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

/**
 * @author rakharrs
 */
@Getter
@Setter
public class FrameworkDetails extends Configuration {
  HashMap<String, FrameworkProperties> frameworks;

  @Override
  public void init() throws Exception {
    setJsonPath("frameworkDetails.json");
    FrameworkDetails frameworkDetails = this.read();
    setFrameworks(frameworkDetails.getFrameworks());
  }
}
