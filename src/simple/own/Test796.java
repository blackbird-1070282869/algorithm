package simple.own;

import java.util.ArrayList;

public class Test796 {
    public boolean rotateString(String s, String goal) {
        char[] sto = s.toCharArray();
        char[] gto = goal.toCharArray();
        int len = gto.length;
        int lens = sto.length;
        if (len != lens) {
            return false;
        }
        char one = gto[0];
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < len; i++) {
            if (sto[i] == one) {
                arrayList.add(i);
            }
        }
        int lenss = arrayList.size();
        boolean is;
        for (int j = 0; j < lenss; j++) {
            int begin = arrayList.get(j);
            int index = 0;
            is = false;
            for (int i = begin; i < len; i++) {
                if (sto[i] != gto[index++]) {
                    is = true;
                    break;
                }
            }
            for (int i = 0; i < begin; i++) {
                if (sto[i] != gto[index++]) {
                    is = true;
                    break;
                }
            }
            if (!is) {
                return true;
            }
        }
        return false;
    }
}
