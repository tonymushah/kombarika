/* (C) 2024 */
package ambovombe.kombarika.configuration.mapping;

/**
 * @author Mamisoa
 */
public class TypeProperty {
  private String type;
  private String packageName;

  // SETTERS & GETTERS
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  // CONSTRUCTORS
  public TypeProperty() {}
}
