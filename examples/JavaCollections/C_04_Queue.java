package JavaCollections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class C_04_Queue {
    public static void main(String[] args) {
        defaultMethods();
    }

    public static void defaultMethods() {
        Queue<Integer> que = new ArrayDeque<>();

        // enqueue
        que.add(1); // [1]
        que.offer(2); // [1,2]
        que.add(3); // [1,2,3]
        que.offer(4); // [1,2,3,4]
        que.add(5); // [1,2,3,4,5]
        // dequeue
        que.remove(); // [2,3,4,5]
        que.remove(); // [3,4,5]
        que.remove(); // [4,5]

        // peek
        System.out.println(que.peek());

        // poll
        System.out.println(que.poll());
    }

    public static void test() {
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            public TreeNode() {
            }

            public TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(null);
    }
}
