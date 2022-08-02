package secondary.own;

public class Test565 {
    public int arrayNesting(int[] nums) {
        boolean[] bit=new boolean[20000];
        int len=nums.length;
        int max=0;
        for (int i = 0; i < len; i++) {
            int index=nums[i];
            int count=1;
            while (!bit[index]){
                count++;
                bit[index]=true;
                index=nums[index];
            }
            if (count>max){
                max=count;
            }
        }
        return max;
    }
}
