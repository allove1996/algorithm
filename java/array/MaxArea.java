package array;

import java.util.Map;

public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int i = 0, j = height.length - 1, max = 0;

        for(; i < j;) {
            int wide = j - i;
            int minHeight = Math.min(height[i], height[j]);

            max = Math.max(max, wide * minHeight);

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return max;
    }



    /*{
        if (height == null || height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            int length = j - i + 1;
            maxArea = Math.max(maxArea, minHeight * length);
        }

        return maxArea;
    }*/

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = new MaxArea().maxArea(height);
        System.out.println(maxArea);
    }
}
