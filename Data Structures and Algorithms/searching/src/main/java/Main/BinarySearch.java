package Main;
import java.util.List;

public class BinarySearch implements Search<Integer> {
  private final List<Integer> sortedList;

  private int iteration_count = 0;

  public BinarySearch(final List<Integer> list) {
    this.sortedList = list;
  }

  @Override
  public int findItem(final Integer needle) {
    iteration_count = 0;
    return binarySearch(needle, 0, sortedList.size());
  }

  private Integer binarySearch(final int needle, final int lowerLimit, final int upperLimit) {
    iteration_count += 1;

    if (lowerLimit > upperLimit)
      return Search.NO_KEY;

    final int middle = (lowerLimit + upperLimit) / 2;
    final int item = sortedList.get(middle);

    System.out.println(iteration_count + ". Iteration mit unterer Schranke: "  + lowerLimit + " und oberer Schranke: " + upperLimit + " . Überprüft Index: " + middle);

    if(item == needle){
      return middle;
    }
    
    if(needle < item){
      return binarySearch(needle, lowerLimit, middle - 1);
    }

    return binarySearch(needle, middle + 1, upperLimit);
  }
}
