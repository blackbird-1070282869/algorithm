package common.translate;

/**
 * 快速排序
 */
public class QuickPlatoon {


    public int[] arraySort(int[] array){
        int len=array.length;
        quickPlatoon(array,0,len-1);
        return array;
    }

    public void quickPlatoon(int[] array,int begin,int end){
        if (begin>=end){
            return;
        }
        int pivot=array[begin];
        int next=begin;
        int previous=end;
        while (next<previous){
            if (array[next]>pivot){
                while (previous>next&&array[previous]>pivot)previous--;
                if (previous>next){
                    changeLocal(array,next,previous);
                }
            }
            next++;
        }
        if (array[next]<pivot){
            changeLocal(array,begin,next);
        }else {
            while (next>begin&&array[next]>pivot)next--;
            if (next!=begin){
                changeLocal(array,array[next],array[begin]);
            }
        }
        quickPlatoon(array,0,next-1);
        quickPlatoon(array,next+1,end);
    }

    private void changeLocal(int[] array, int next, int previous) {
        int temp=array[next];
        array[next]=array[previous];
        array[previous]=temp;
    }

}
