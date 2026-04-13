import java.util.Stack;

public class ReverseStack {
    static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) { s.push(x); return; }
        int temp = s.pop();
        insertAtBottom(s, x);
        s.push(temp);
    }
    static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertAtBottom(s, x);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1); s.push(2); s.push(3);
        reverse(s);
        System.out.println("Reversed stack: " + s);
    }
}