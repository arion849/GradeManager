package uk.ac.rhul.cs2800.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NoGradeAvailableExceptionTest {

  @Test
  void testNoGradeAvailableException() {
    // Confirm that NoGradeAvailableException can be thrown
    assertThrows(NoGradeAvailableException.class, () -> {
      throw new NoGradeAvailableException();
    });
  }
}
