package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class IsValid {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : chars) {
            if (deque.peek() != null && deque.peek() == ch) {
                deque.poll();
                continue;
            }

            if (ch == '(') {
                deque.push(')');
            } else if (ch == '[') {
                deque.push(']');
            } else if (ch == '{') {
                deque.push('}');
            } else {
                return false;
            }

        }

        return deque.isEmpty();
    }

    public static void main(String[] args) {
        String temp = "[";
        boolean isValid = new IsValid().isValid(temp);
        System.out.println(isValid);
    }
}
