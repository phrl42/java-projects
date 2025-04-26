package Main;

import java.util.List;
import java.util.LinkedList;

public class MergeSort implements Sorting {

  @Override
  public List<Integer> sort(List<Integer> list) {

    return mergesort(list);
  }

  private List<Integer> merge(List<Integer> firstHalf, List<Integer> secondHalf) {
    List<Integer> sortedList = new LinkedList<>();

    while (firstHalf.size() != 0 && secondHalf.size() != 0) {
      if (firstHalf.get(0) < secondHalf.get(0)) {
        sortedList.add(firstHalf.get(0));
        firstHalf.remove(0);
      } else {
        sortedList.add(secondHalf.get(0));
        secondHalf.remove(0);
      }
    }

    sortedList.addAll(firstHalf);
    sortedList.addAll(secondHalf);

    return sortedList;
  }

  private List<Integer> mergesort(List<Integer> list) {
    if (list.size() == 1) {
      return list;
    }

    List<Integer> firstHalf = new LinkedList<>();
    List<Integer> secondHalf = new LinkedList<>();

    System.out.println("First Half:");

    for (int i = 0; i < (list.size() / 2); i++) {
      firstHalf.add(list.get(i));
      System.out.println("Index: " + i + " Value: " + list.get(i));

    }

    System.out.println("Second Half:");

    for (int i = (list.size() / 2); i < list.size(); i++) {
      secondHalf.add(list.get(i));
      System.out.println("Index: " + i + " Value: " + list.get(i));
    }

    firstHalf = mergesort(firstHalf);
    secondHalf = mergesort(secondHalf);

    return merge(firstHalf, secondHalf);
  }
}
