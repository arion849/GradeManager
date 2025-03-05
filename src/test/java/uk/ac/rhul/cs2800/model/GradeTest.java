package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for Grade class.
 */
public class GradeTest {

  @Test
  public void testGradeInitialization() {
    Grade grade = new Grade(85);
    assertEquals(85, grade.getScore());
  }
}
