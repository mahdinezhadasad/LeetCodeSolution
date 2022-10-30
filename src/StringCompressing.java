import java.util.Stack;

public class StringCompressing {

    public static void main(String[] args) {

        BST tree = new BST();
        tree.insert(30);
        tree.insert(50);
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(60);
        tree.inorder();
    }
}
class Node {
    Node left;
    int val;
    Node right;
    Node(int val) {
        this.val = val;
    }
}
class BST {
    Node root;

    public void insert(int key) {
        Node node = new Node(key);
        if (root == null) {

            root = node;
            return;
        }
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            if (temp.val > key) {

                prev = temp;
                temp = temp.left;
            } else if (temp.val < key) {

                prev = temp;
                temp = temp.right;
            }
        }
        if (prev.val > key) {

            prev.left = node;
        } else {

            prev.right = node;
        }

    }

    public void inorder() {
        Node tempt = root;
        Stack<Node> stack = new Stack<>();
        while (tempt != null || !stack.isEmpty()) {
            if (tempt != null) {

                stack.add(tempt);
                System.out.println(tempt.val + "");
                tempt = tempt.left;
                
            } else {

                tempt = stack.pop();
                System.out.println(tempt.val + "");
                tempt = tempt.right;
            }

        }


    }
}