import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class PlayGround {
  public static void main(String[] args) {
    char ch = (char) ('0' + 9);
    System.out.println(ch);

    List<Integer> list = new ArrayList<>() ;
    // Long.MAX_VALUE
  }

  public static class A {
    int val;

    protected A() {

    }

    public void method() {
      System.out.println("A method");
    }
  }

  public static class B extends A {

    public B() {
      super();
    }

    // @Override
    public void method() {
      System.out.println("B method");
    }
  }

}
