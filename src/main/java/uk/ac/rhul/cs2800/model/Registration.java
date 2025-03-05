package uk.ac.rhul.cs2800.model;

/**
 * Represents a registration record for a student.
 */
public class Registration {

  /** The student registered. */
  private Student student;

  /** The module the student is registered in. */
  private Module module;

  /**
   * Constructs a Registration for a student in a specific module.
   *
   * @param student The student being registered.
   * @param module The module the student is registered in.
   */
  public Registration(final Student student, final Module module) {
    this.student = student;
    this.module = module;
  }

  /**
   * Gets the student associated with this registration.
   *
   * @return The student.
   */
  public Student getStudent() {
    return student;
  }

  /**
   * Gets the module associated with this registration.
   *
   * @return The module.
   */
  public Module getModule() {
    return module;
  }
}
