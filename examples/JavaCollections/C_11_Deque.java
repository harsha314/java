package JavaCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class C_11_Deque {

  public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
    deque.addLast(1);
    deque.addLast(2);
    deque.addLast(3);
    while (!deque.isEmpty()) {
      System.out.println(deque.removeLast());
    }
  }
}
