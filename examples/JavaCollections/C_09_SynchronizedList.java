package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C_09_SynchronizedList {
  public static void main(String[] args) {
    List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
    list.add(5);
  }

}
