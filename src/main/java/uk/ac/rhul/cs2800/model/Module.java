package uk.ac.rhul.cs2800.model;

/**
 * Represents a module in the grade management system.
 */
public class Module {

  /** The code of the module. */
  private String code;

  /** The name of the module. */
  private String name;

  /** Indicates if the module is mandatory and non-condonable. */
  private boolean mnc;

  /**
   * Constructs a Module with a specific code, name, and mandatory non-condonable status.
   *
   * @param code The code of the module.
   * @param name The name of the module.
   * @param mnc True if the module is mandatory and non-condonable.
   */
  public Module(final String code, final String name, final boolean mnc) {
    this.code = code;
    this.name = name;
    this.mnc = mnc;
  }

  /**
   * Gets the code of the module.
   *
   * @return The code.
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the name of the module.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Checks if the module is mandatory and non-condonable.
   *
   * @return True if the module is mandatory and non-condonable.
   */
  public boolean isMnc() {
    return mnc;
  }
}
