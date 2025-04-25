package Main;

import java.util.List;

public class SequentialSearch<T> implements Search<T> {
  private final List<T> sortedList;

  public SequentialSearch(final List<T> list) {
    this.sortedList = list;
  }

  @Override
  public int findItem(final T needle) {
    for (int i = 0; i < sortedList.size(); i++) {
      final T value = sortedList.get(i);

      System.out.println((i + 1) + ". Iteration mit index: " + i + " und Wert: " + value);

      if (value == needle) {
        return i;
      }
    }
    return Search.NO_KEY;
  }

}
