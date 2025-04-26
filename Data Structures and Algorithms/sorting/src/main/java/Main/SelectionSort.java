package Main;

import java.util.List;

public class SelectionSort implements Sorting {

  @Override
  public List<Integer> sort(final List<Integer> list) {

    for (int i = 0; i < list.size(); i++) {
      int biggestItem = 0;
      int biggestItemIndex = 0;

      for (int j = 0; j < (list.size() - i); j++) {
        int value = list.get(j);

        if (value > biggestItem) {
          biggestItem = value;
          biggestItemIndex = j;
        }
      }
      
      final int last_item = list.get((list.size() - 1) - i);
      list.set((list.size() - 1)  - i , biggestItem);
      list.set(biggestItemIndex, last_item);
    }

    return list;
  }
}
