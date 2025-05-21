package org.bunkerserver.DSA.Search;

import java.util.List;

public class SequentialSearch<T extends Comparable<T>> implements ISearch<T> {
  private final List<T> list;

  public SequentialSearch(final List<T> list) {
    this.list = list;
  }

  @Override
  public int findItem(final T needle) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).compareTo(needle) == 0) {
        return i;
      }
    }
    return -1;
  }
}
