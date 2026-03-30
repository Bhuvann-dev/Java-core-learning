import java.util.Stack;

public class StringReverseStack {
    public static void main(String[] args) {
        String str = "Bengaluru";
        Stack<Character> s = new Stack<>();
        for(char c : str.toCharArray()) s.push(c);
        
        System.out.print("Reversed: ");
        while(!s.isEmpty()) System.out.print(s.pop());
    }
}
