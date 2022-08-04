package secondary.own;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 答案错误题意不明确
 *
 */
public class Test825 {
    public int numFriendRequests(int[] ages) {
        int len=ages.length;
        Arrays.sort(ages);
        int max=0;
        for (int i = len-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (ages[i]>=ages[j]&&0.5*ages[i]+7>ages[j])max++;
            }
        }
        return max;
    }
}
