package uk.ac.rhul.cs2800.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NoRegistrationExceptionTest {

  @Test
  void testNoRegistrationException() {
    // Confirm that NoRegistrationException can be thrown
    assertThrows(NoRegistrationException.class, () -> {
      throw new NoRegistrationException();
    });
  }
}
