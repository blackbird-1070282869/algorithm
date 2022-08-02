package secondary.own;

/**
 * 删除字符串两端相同字符后的最短长度
 * 运用双指针，交叉位置的数字需要做处理
 */
public class Test1750 {
    public int minimumLength(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int begin = 0;
        int end = len - 1;
        if (len <= 1) {
            return len;
        }
        while (begin < end) {
            if (chars[begin] != chars[end]){
                return end-begin+1;
            }
            while (begin < end && chars[begin++] == chars[begin]) ;
            while (end >= begin && chars[end--] == chars[end]) ;
            int endSame = end + 1;
            if (end <= begin) {
                if (chars[endSame] == chars[end]) {
                    return 0;
                }
                return 1;
            }
        }
        return 0;
    }
}
