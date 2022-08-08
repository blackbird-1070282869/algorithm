package difficulty.own;

import java.util.BitSet;

public class Test60 {
    public String getPermutation(int n, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        BitSet bitSet = new BitSet(n);
        int yu = k;
        int bei = 1;
        int nowBei = n - 1;
        while (nowBei > 1) {
            bei *= nowBei;
            nowBei -= 1;
        }
        for (int i = n; i > 1; i--) {
            int s = yu / bei;
            int rank = yu % bei;
            if (rank == 0) {
                stringBuffer.append(count(bitSet, s, n));
                for (int j = n - 1; j >= 0; j--) {
                    if (!bitSet.get(j)) {
                        stringBuffer.append(j + 1);
                    }
                }
                return stringBuffer.toString();
            }
            s += 1;
            stringBuffer.append(count(bitSet, s, n));
            yu = rank;
            bei /= (i - 1);
        }
        for (int i = 0; i < n; i++) {
            if (!bitSet.get(i)) {
                stringBuffer.append(i + 1);
            }
        }
        return stringBuffer.toString();
    }

    public Integer count(BitSet bitSet, int local, int len) {
        for (int i = 0; i < len; i++) {
            if (!bitSet.get(i) && (--local == 0)) {
                bitSet.set(i, true);
                return i + 1;
            }
        }
        return 0;
    }
}
