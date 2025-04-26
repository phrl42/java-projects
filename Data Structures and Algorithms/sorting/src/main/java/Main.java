
import java.util.List;

import Main.InsertionSort;
import Main.MergeSort;
import Main.QuickSort;
import Main.SelectionSortBloated;
import Main.SelectionSort;
import Main.Sorting;

import java.util.LinkedList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();

    Random rand = new Random();

    for(int i = 0; i < 10; i++){
      list.add(rand.nextInt(40));
    }

    for(int i = 0; i < list.size(); i++){
      System.out.println("Index: " + i + " and value: " + list.get(i));
    }

    Sorting sort = new QuickSort();

    final long startTime = System.nanoTime();
    sort.sort(list);
    final long endTime = System.nanoTime();

    final long duration = endTime - startTime;

    for(int i = 0; i < list.size(); i++){
      System.out.println("Index: " + i + " and value: " + list.get(i));
    }

    System.out.println((duration / 1000000) + " ms");

    return;
  }
}