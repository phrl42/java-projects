package Main;

import java.util.List;

public class QuickSort implements Sorting {

  @Override
  public List<Integer> sort(List<Integer> list) {
    MQuickSort(list, 0, list.size() - 1);
    return list;
  }

  private List<Integer> MQuickSort(List<Integer> list, int lowerLimit, int upperLimit) {
    if (upperLimit > lowerLimit) {
      int pn = Split(list, lowerLimit, upperLimit, list.size() / 2);

      MQuickSort(list, lowerLimit, pn - 1);
      MQuickSort(list, pn + 1, upperLimit);
    }

    return list;
  }

  private int Split(List<Integer> list, int lowerLimit, int upperLimit, int pivotPosition) {
    int pn = lowerLimit;
    int pv = list.get(pivotPosition);
    list.set(upperLimit, pv);

    for (int i = lowerLimit; i < upperLimit - 1; i++) {
      if (list.get(i) < pv) {
        int pnvalue = list.get(pn);
        list.set(pn, list.get(i));
        list.set(i, pnvalue);
        pn = pn + 1;
      }
    }

    int upperValue = list.get(upperLimit);

    list.set(upperLimit, list.get(pn));
    list.set(pn, upperValue);
    return pn;
  }
}
