package stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class IsValid {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (deque.peek() != null && chars[i] == deque.peek()) {
                deque.poll();
                continue;
            }

            if (chars[i] == '(') {
                deque.push(')');
            } else if (chars[i] == '[') {
                deque.push(']');
            } else if (chars[i] == '{') {
                deque.push('}');
            } else {
                return false;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        String temp = "()";
        boolean isValid = new IsValid().isValid(temp);
        System.out.println(isValid);
    }
}
