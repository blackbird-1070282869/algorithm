package secondary.own;

public class Testjianzhi92 {
    public int minFlipsMonoIncr(String s) {
        char[] arr = s.toCharArray();
        boolean zero = false;
        boolean one = false;
        int len = arr.length;
        if (len <= 1) {
            return 0;
        }
        int count1=0;
        int count0=0;
        int chan0=0;
        int chan1=0;
        for (int i = len - 2; i > 0; i++) {
            if (arr[i] == '1') {
                zero=true;
                count1++;
                if (one){
                    chan1++;
                }
                continue;
            }
            else if (zero){
                one=true;
                chan0++;
            }
            count0++;
        }
        int  min=count0>=count1?count1:count0;
        if (chan1==0||chan0==0){
            chan0=chan1<=chan0?chan0:chan1;
        }
        else {
            chan0=chan1>=chan0?chan0:chan1;
        }
        return min>=chan0?chan0:min;
    }
}
