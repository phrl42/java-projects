package Main;

import java.util.List;

public class BubbleSort implements Sorting {
    @Override
  public List<Integer> sort(List<Integer> list) {
    boolean swapped = true;

    while(swapped){
      swapped = false;

      for(int i = 0; i < list.size() - 1; i++){

        for(int j = 0; j < list.size() - 1; j++){
        
          if(list.get(i).compareTo(list.get(i + 1)) > 0){
            swapped = true;

            final int value = list.get(i);

            list.set(i, list.get(i + 1));
            list.set(i + 1, value);
          }

        }
      }

    }

    return list;
  }
}
