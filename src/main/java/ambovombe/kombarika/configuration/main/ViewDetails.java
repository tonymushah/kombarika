/* (C) 2024 */
package ambovombe.kombarika.configuration.main;

import ambovombe.kombarika.configuration.Configuration;
import ambovombe.kombarika.configuration.mapping.ViewProperties;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mamisoa
 */
@Getter
@Setter
public class ViewDetails extends Configuration {
  HashMap<String, ViewProperties> views;

  @Override
  public void init() throws Exception {
    setJsonPath("ViewDetails.json");
    ViewDetails v = this.read();

    this.setViews(v.getViews());
  }
}
