package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        if (heights == null) {
            return 0;
        }
        if (heights.length == 1){
            return heights[0];
        }
        int area = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int height = heights[stack.poll()];
                while (!stack.isEmpty() && heights[stack.peek()] == height) {
                    stack.poll();
                }
                int width = 0;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                area = Math.max(area, width * height);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int height = heights[stack.poll()];
            int width = 0;
            if (stack.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - stack.peek() - 1;
            }
            area = Math.max(area, width * height);
        }
        return area;
    }
}
