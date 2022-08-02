package common.translate;

import java.util.*;

/**
 * 姓名：陈琛
 * 完成时间： 2022-7-27
 */
public class Test {

    public  int print(char []nums) {
        int len=nums.length;
        int index=1;
        char nowIndex=nums[0];
        ArrayList<Character> arrayList=new ArrayList<>();
        for (int i = 1; i < len; i++) {
            char now= nums[i];
            if (now!=nowIndex){
                arrayList.add(nowIndex);
                dealString(index,arrayList);
                nowIndex=now;
                index=1;
                continue;
            }
            index++;
        }
        arrayList.add(nowIndex);
        dealString(index,arrayList);
        int lens=arrayList.size();
        for (int i = 0; i < lens; i++) {
            System.out.print(arrayList.get(i));
        }
        return arrayList.size();
    }


    public void dealString(Integer x,ArrayList<Character> arrayList){
        String string=String.valueOf(x);
        char[] chars=string.toCharArray();
        int cLen=chars.length;
        if (cLen==1){
            if (chars[0]!='1'){
                arrayList.add(chars[0]);
            }
        }
        else {
            for (int j = 0; j < cLen; j++) {
                arrayList.add(chars[j]);
            }
        }
    }

}
