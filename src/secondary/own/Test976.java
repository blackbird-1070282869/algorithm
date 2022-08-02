package secondary.own;

import java.util.Arrays;

public class Test976 {
    public int largestPerimeter(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        for (int i = len-1; i > 1; i--) {
            if ((nums[i-2]+nums[i-1])>nums[i]){
                return nums[i-2]+nums[i-1]+nums[i];
            }
        }
        return 0;
    }
}
