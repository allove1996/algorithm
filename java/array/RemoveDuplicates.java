package array;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }


//    public int removeDuplicates(int[] nums) {
//        int i = 0, j = 0;
//        for (; i < nums.length; i++) {
//            if(nums[i] != nums[j]) {
//                j++;
//                nums[j] = nums[i];
//            }
//        }
//        return j+1;
//    }
}
