package common.translate;

public class MaoPaoSort {
    /**
     * 一.逻辑题
     * 1
     * 假如有m块钱
     */
    public void oneLogic(int m){
        int count=m;
        int base=0;
        while (count>=2){
            count-=2;
            count++;
            base++;
        }
        int res=m+base;
        System.out.println("如果有 "+m+" 块钱，能换 "+ res+"个饮料");
    }
    /**
     * 一.逻辑题
     * 2
     *  1.11先倒满，往空的7俩里倒，这是11俩的瓶子里有4两
     *  2.将7两的瓶子腾空，将4两倒入
     *  3，将11两倒满，放入盛了4两的7两瓶子里，此时11两瓶子省11-（7-4）=8
     *  4.将7两腾空，将8两放入，11的瓶子里剩1两
     *  5.将7两腾空，将1两放入，将11两盛满，倒入7两，瓶内此时，11两瓶子剩11-（7-1）=5
     *  6，将7两腾空，将5两放入，将11两盛满，倒入7两，瓶内此时，11两瓶子剩11-（7-5）=9
     *  7.将7两放空，将9两放入7两瓶内，此时11两瓶内剩下9-7=2，得到2两酱油
     */
    /**
     * 三.编程题
     * 1
     * 字符串反转
     * @param string
     * @return
     */
    public String fanZhuan(String string){
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    /**
     * 三.编程题
     * 2
     *冒泡排序
     * @param arr
     */
    public void maoPao(int[] arr) {
        int size = arr.length;
        int j, i, tem;
        for (i = 0; i < size - 1; i++) {
            boolean count = true;
            int len = size - 1 - i;
            for (j = 0; j < len; j++) {
                if (arr[j] > arr[j + 1]) {
                    tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    count = false;
                }
            }
            if (count)
                break;
        }
    }
    /**
     * 三.编程题
     * 3
     * sql
     */
    public void sql(){
        /**
         * 假设这个表名字为 score_table
         */
        //A 俩句sql，尽量避免子查询
        String sqlA1="select name from score_table where score<=65 group by name;";
        //上一句的结果名为list
        String sqlA2="select name from score_table where name not in list group by name;";

        //B
        String sqlB="select name as n, avg(score) as avs from score_table group by name order by avs desc limit 1";

        //C 列出每一科成绩最高的学生列表
        String sqlC="select name as n, max(score) as mas from score_table group by kecheng;";
    }



}
