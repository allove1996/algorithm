package array;

public class Rotate {
    // [-1,-100,3,99] 2


    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;

        new Rotate().rotate(nums, k);

        for (int i :
                nums) {
            System.out.println(i);
        }
    }


    public void rotate(int[] nums, int k) {
       k = k % nums.length;
       int count = 0;
       for (int i = 0; count < nums.length; i++) {
           int current = i;
           int pre = nums[current];
           do {
               int nextIdx = (current + k) % nums.length;
               int temp = nums[nextIdx];
               nums[nextIdx] = pre;
               current = nextIdx;
               pre = temp;
               count++;
           }while (i != current);
       }
    }
}