package Main;

public interface Search<T> {
  static final int NO_KEY = -1;

  /**
   * 
   * @param needle the value to be searched for
   * @return the position in the list where the integer has been found
   */
  public int findItem(final T needle);
}
