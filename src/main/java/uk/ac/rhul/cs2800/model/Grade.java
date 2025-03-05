package uk.ac.rhul.cs2800.model;

/**
 * Represents a grade with a score.
 */
public class Grade {

  /** The score of the grade. */
  private int score;

  /**
   * Constructs a Grade with a specific score.
   *
   * @param score The score value for this grade.
   */
  public Grade(final int score) {
    this.score = score;
  }

  /**
   * Gets the score of this grade.
   *
   * @return The score.
   */
  public int getScore() {
    return score;
  }
}
