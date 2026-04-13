class Node {
    int data;
    Node left, right;
    Node(int item) { data = item; }
}

public class CountLeaves {
    int getLeafCount(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return getLeafCount(node.left) + getLeafCount(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println("Leaf count: " + new CountLeaves().getLeafCount(root));
    }
}