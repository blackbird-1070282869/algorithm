package simple.own;

import java.util.Arrays;

/**
 * 测试用例有问题，此版跑用例会出错
 */
public class Test45 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gLen=g.length;
        int sLen=s.length;
        int res=0;
        int gIndex=0;
        int sIndex=0;
        int midRes=0;
        while (gIndex<gLen){
            midRes-=g[gIndex++];
            while (sIndex<sLen&&midRes<0){
                midRes+=s[sIndex++];
            }
            if (midRes>=0){
                res++;
            }
        }
        return res;
    }
}
