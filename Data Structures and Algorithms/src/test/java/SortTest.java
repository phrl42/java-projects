
import org.bunkerserver.DSA.Search.BinarySearch;
import org.bunkerserver.DSA.Search.ISearch;
import org.bunkerserver.DSA.Search.SequentialSearch;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

public class SortTest {
  
  @Test
  public void BinarySearch(){
    List<Integer> list = new LinkedList<Integer>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    ISearch<Integer> search = new BinarySearch<>(list);

    assertEquals(4, search.findItem(Integer.valueOf(5)));
  }

  @Test
  public void SequentialSearch(){
    List<Integer> list = new LinkedList<Integer>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    ISearch<Integer> search = new SequentialSearch<>(list);

    assertEquals(4, search.findItem(Integer.valueOf(5)));
  }
}
