package JavaCollections;

import java.util.Stack;

public class C_03_Stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        // push
        stk.push(1); // [1]
        stk.push(2); // [1,2]
        stk.push(3); // [1,2,3]
        stk.push(4); // [1,2,3,4]
        stk.push(5); // [1,2,3,4,5]

        //
        System.out.println(stk.get(0));

        // pop
        stk.pop(); // [1,2,3,4]
        stk.pop(); // [1,2,3]
        stk.pop(); // [1,2]

        // peek
        System.out.println(stk.peek());

        // poll
    }
}
