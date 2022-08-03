package common.translate;

/**
 * 归并排序
 * 自己实现
 */
public class MergeSort {


    public void mergeSort(int[] array) {
        int len = array.length;
        int group = 0;
        int arr[] = new int[len];
        int groupLen = 1;
        while (group < len) {
            for (int i = group; i < len; ) {
                i = twoArrayMerge(i, groupLen, len, array, arr);
            }
            group = group * 2 + 1;
            groupLen = group + 1;
        }
    }

    private int twoArrayMerge(int i, int groupLen, int len, int[] array, int[] arr) {
        int twoEndIndex = i + groupLen;
        if (twoEndIndex >= len) {
            twoEndIndex = len - 1;
        }
        int oneBeginIndex = i - groupLen + 1;
        int oneStr = oneBeginIndex;
        int arrStr = oneBeginIndex;
        int twoStr = i + 1;
        while (oneStr <= i && twoStr <= twoEndIndex) {
            if (array[oneStr] > array[twoStr]) {
                arr[arrStr++] = array[twoStr++];
                continue;
            }
            arr[arrStr++] = array[oneStr++];
        }
        while (twoStr < twoEndIndex) arr[arrStr++] = array[twoStr++];
        while (oneStr <= i) arr[arrStr++] = array[oneStr++];
        for (int j = oneBeginIndex; j < arrStr; j++) {
            array[j] = arr[j];
        }
        return groupLen * 2 + i;
    }
}
