package Main;

import java.util.List;

public class InsertionSort implements Sorting {

  @Override
  public List<Integer> sort(List<Integer> list) {

    for (int i = 0; i < list.size(); i++) {
      final int newestItem = list.get(i);

      int j = i;
      while (j > 0) {
        if (list.get(j - 1) > newestItem) {
          list.set(j, list.get(j - 1));
          j = j - 1;
        } else {
          break;
        }
      }

      list.set(j, newestItem);
    }

    return list;
  }
}
