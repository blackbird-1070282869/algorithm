package simple.own;

public class Test896 {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length;
        int j=1;
        int i=0;
        boolean a=true;
        while (j < len&&nums[i]==nums[j]) {
            i=j;
            j++;
        }
        if (j==len) return a;
        if (nums[i++]<nums[j++]) a=false;
        while (j < len) {
            if (nums[i]<nums[j]){
                if (a) return false;
            }else if (nums[i]>nums[j]){
                if (!a) return false;
            }
            i=j;j++;
        }
        return true;
    }
}
