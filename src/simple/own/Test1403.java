package simple.own;

import java.util.ArrayList;
import java.util.List;

public class Test1403 {
    public List<Integer> minSubsequence(int[] nums) {
        char[] arr = new char[101];
        int len = nums.length;
        List<Integer> list = new ArrayList<>(len);
        int total = 0;
        for (int i = 0; i < len; i++) {
            int now = nums[i];
            arr[now] += 1;
            total += nums[i];
        }
        total /= 2;
        int nowTotal = 0;
        for (int i = 100; i > 0; i--) {
            int index = arr[i];
            if (index==0){
                continue;
            }
            while (index != 0 && nowTotal <= total) {
                nowTotal += i;
                list.add(i);
                index--;
            }
            if (nowTotal > total) {
                return list;
            }
        }
        return list;
    }
}
