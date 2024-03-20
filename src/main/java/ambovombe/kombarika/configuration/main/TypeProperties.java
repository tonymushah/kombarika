/* (C) 2024 */
package ambovombe.kombarika.configuration.main;

import ambovombe.kombarika.configuration.Configuration;
import ambovombe.kombarika.configuration.mapping.TypeMapping;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeProperties extends Configuration {
  HashMap<String, TypeMapping> listProperties;

  @Override
  public void init() throws Exception {
    setJsonPath("typeProperties.json");
    TypeProperties typeProperties = this.read();
    setListProperties(typeProperties.getListProperties());
  }
}
