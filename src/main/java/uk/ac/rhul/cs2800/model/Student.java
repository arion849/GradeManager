package uk.ac.rhul.cs2800.model;

/**
 * Student class.
 */
public class Student {

  private String username;
  private String email;
  private long id;
  private String firstName;
  private String lastName;

  /**
   * Student class initialised.
   */
  public Student(long id, String firstName, String lastName, String username, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;

  }

}
