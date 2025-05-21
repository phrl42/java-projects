package org.bunkerserver.DSA.Search;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements ISearch<T> {
  private final List<T> list;

  public BinarySearch(final List<T> list){
    this.list = list;
  }

  private int binarySearch(int lowerLimit, int upperLimit, final T needle){
    final int middle = (lowerLimit + upperLimit) / 2;
    final int cmp = list.get(middle).compareTo(needle);

    if(lowerLimit > upperLimit){
      return -1;
    }

    if(cmp == 0){
      return middle;
    }
    else if(cmp > 0){
      return binarySearch(lowerLimit, middle - 1, needle);
    }
    
    return binarySearch(middle + 1, upperLimit, needle);
  }
  
  @Override
  public int findItem(final T needle){
    return binarySearch(0, list.size(), needle);
  }
}
