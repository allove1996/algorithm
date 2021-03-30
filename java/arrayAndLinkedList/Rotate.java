package arrayAndLinkedList;

public class Rotate {
    public void rotate(int[] nums, int k) {
        for (int i = nums.length - 1; i > nums.length - k - 1; i--) {
            int newIdx = (i+k) % nums.length;
            int temp = nums[newIdx];
            nums[newIdx] = nums[i];
            nums[i] = temp;
        }



    }

    public static void main(String[] args) {
        
    }
}
