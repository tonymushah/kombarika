/* (C) 2024 */
package ambovombe.kombarika.configuration.mapping;

import java.util.HashMap;

/**
 * @author Mamisoa
 */
public class TypeMapping {
  HashMap<String, TypeProperty> listMapping;

  // GETTERS & SETTERS

  public HashMap<String, TypeProperty> getListMapping() {
    return listMapping;
  }

  public void setListMapping(HashMap<String, TypeProperty> listMapping) {
    this.listMapping = listMapping;
  }

  // CONSTRUCTOR
  public TypeMapping() {}
}
