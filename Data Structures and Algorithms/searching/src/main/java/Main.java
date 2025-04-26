import java.util.List;
import Main.SequentialSearch;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();

    list.add("A");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("G");
    list.add("H");
    list.add("I");
    list.add("Z");

    SequentialSearch<String> search = new SequentialSearch<>(list);

    int index = search.findItem("H");

    System.out.println("gefundener Index: " + index);

    return;
  }
}
