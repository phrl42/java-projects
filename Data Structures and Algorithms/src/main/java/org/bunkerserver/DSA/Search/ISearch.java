package org.bunkerserver.DSA.Search;

public interface ISearch<T extends Comparable<T>> {  

  /**
   * this will return the index of the object to be found in the list
   * 
   * this function will return -1 if the object could not be found
   * @param needle
   * @return index or -1 if not found
   */
  public int findItem(final T needle);
}
