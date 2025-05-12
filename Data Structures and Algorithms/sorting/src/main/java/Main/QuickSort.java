package Main;

import java.util.List;

public class QuickSort implements Sorting {

  private int p;

  @Override
  public List<Integer> sort(List<Integer> list) {
    p = list.size() / 2;

    FunctionQuickSort(list, 0, list.size() - 1);
    return list;
  }

  private void FunctionQuickSort(List<Integer> list, int l, int u)
  {
    if(l < u){
      int pn = Split(list, l, u);

      FunctionQuickSort(list, l, pn - 1);
      FunctionQuickSort(list, pn + 1, u);
    }
  }

  private int Split(List<Integer> list, int l, int u){
    int pn = l;
    int pv = list.get(p);

    int tmp = list.get(p);
    list.set(p, list.get(u));
    list.set(u, tmp);

    for(int i = l; i < u; i++){
      if(list.get(i) < pv){

        tmp = list.get(i);
        list.set(i, list.get(pn));
        list.set(pn, tmp);

        pn = pn + 1;
      }
    }

    tmp = list.get(u);

    list.set(u, list.get(pn));
    list.set(pn, tmp);
  
    return pn;
  }

}
