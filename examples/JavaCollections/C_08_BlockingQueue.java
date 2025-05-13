package JavaCollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class C_08_BlockingQueue {
  public static void main(String[] args) {
    BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);
    bq.add(10);
    bq.add(20);
    bq.add(30);
    Integer head = bq.poll();
    System.out.println(head);
  }
}
