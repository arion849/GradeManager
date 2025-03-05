package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test class for Registration.
 */
public class RegistrationTest {

  /**
   * Tests the initialization of a Registration object.
   */
  @Test
  public void testRegistrationInitialization() {
    Student student = new Student(1L, "Joe", "Williams", "jwilliams", "joewilliams@example.com");
    Module module = new Module("CS2800", "Software Development", true);

    Registration registration = new Registration(student, module);

    assertEquals(student, registration.getStudent());
    assertEquals(module, registration.getModule());
  }
}
