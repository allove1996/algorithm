package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        if (heights == null) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        int len = heights.length;
        int area = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
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

        while (!stack.isEmpty()) {
            int height = heights[stack.peek()];
            while (!stack.isEmpty() && heights[stack.peek()] == height) {
                stack.poll();
            }
            int width;
            if (stack.isEmpty()) {
                width = len;
            } else {
                width = len - stack.peek() - 1;
            }

            area = Math.max(area, width * height);
        }

        return area;
    }

    public static void main(String[] args) {
        int[] height = new int[]{2,1,5,6,2,3};
        int largestArea = new LargestRectangleArea().largestRectangleArea(height);
        System.out.println(largestArea);
    }
}
