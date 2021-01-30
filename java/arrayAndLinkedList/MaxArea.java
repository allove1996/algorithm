package arrayAndLinkedList;

public class MaxArea {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int minHeight = height[i] > height[j] ? height[j--] : height[i++];
            area = Math.max(area, minHeight * (j - i + 1));
        }
        return area;
    }
}
