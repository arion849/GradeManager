package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

/**
 * Asserts for StudentTest.
 */
public class StudentTest {

  @Test
  public void testStudent() {
    assertDoesNotThrow(
        () -> new Student(1L, "Joe", "Williams", "jwilliams", "joewilliams@gmail.com"));
  }

}
