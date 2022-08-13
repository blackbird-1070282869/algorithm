package difficulty.own;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test1416 {
    public int numberOfArrays(String s, int k) {
        int len=s.length();
        char []sArr=s.toCharArray();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int pre=sArr[0]-'0';
        char now;
        int eleLen=0;
        int kLen=count(k);
        int minLen=kLen-1;
        for (int i = 0; i < len; i++) {
            now=sArr[i];
            if (now=='0'){
                if (pre==0){
                    return 0;
                }
                map.remove(pre);
                pre*=10;
            }
            else {
                Integer a=1;
                if (pre>k){
                    return 0;
                }else if (pre==k){
                    return 1;
                }else if (pre>=10){
                    a=count(pre);
                    if (a==kLen) eleLen--;
                }
                map.put(pre,a);
                pre=now-'0';
                eleLen++;
            }
        }
        map.put(pre,count(pre));


        return 0;

    }

//    public static int f(int n,int num){
//        if(n<=2) return n;
//        int x = f(n-1)+f(n-2);
//        return x;
//    }

    public Integer count(int num){
        int count=0;
        while(num > 0){
            num=num / 10;
            count++;
        }
        return count;
    }
}
