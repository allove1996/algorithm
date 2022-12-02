package array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }

        for(int i = 0, j = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }


    }



    /*{
        int i = 0, j = 0;
        for (; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }*/


    /*

    if (nums == null || nums.length == 0) {
            return;
        }

        int left = 0, right = 0;

        for (; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
     */


    private void trans(int startIdx, int[] nums) {
        for (int i = startIdx; i < nums.length - 1; i++) {
            if (nums[i + 1] != 0) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
