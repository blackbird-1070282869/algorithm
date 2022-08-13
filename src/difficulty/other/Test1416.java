package difficulty.other;

public class Test1416 {
    long mod=(long)(1e9+7);
    public int numberOfArrays(String s, int k) {
        int n=s.length();
        if(n==0)return 0;
        if(s.charAt(0)=='0')return 0;
        long maxnumber=0;
        long[] presum=new long[n+2];
        presum[1]=1;
        int j=1;
        long[] base=new long[15];
        base[0]=1;
        for(int i=1;i<15;i++)base[i]=10*base[i-1];
        long pre=0;
        long[] dp=new long[n+1];
        for(int i=1;i<=n;i++){
            maxnumber=maxnumber*10+s.charAt(i-1)-'0';
            while(j<=i&&maxnumber>k){
                maxnumber-=(s.charAt(j-1)-'0')*base[i-j];
                j++;
            }
            dp[i]=presum[i]-presum[j-1];
            if(i<n&&s.charAt(i)!='0'){
                presum[i+1]=presum[i]+dp[i];
                presum[i+1]%=mod;
            }else{
                presum[i+1]=presum[i];
            }

        }
        return (int)((dp[n]%mod+mod)%mod);
    }
}
