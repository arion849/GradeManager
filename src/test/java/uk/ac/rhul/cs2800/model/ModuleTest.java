package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test class for Module.
 */
public class ModuleTest {

  /**
   * Tests the initialization of a Module object.
   */
  @Test
  public void testModuleInitialization() {
    Module module = new Module("CS2800", "Software Development", true);

    assertEquals("CS2800", module.getCode());
    assertEquals("Software Development", module.getName());
    assertTrue(module.isMnc());
  }
}
