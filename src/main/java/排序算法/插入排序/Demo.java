package 排序算法.插入排序;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 4, 77, 22, 434, 66};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * 插入排序，
     * 原理：假设前面已经排序，新插入的数字找到小于自己的，直接插入这个位置就可以
     */
    private static void sort(int[] arr) {
        int len = arr.length;
        int insertIdx = 0;
        for (int i = 1; i < len; i++) {
            int curVal = arr[i];
            insertIdx = i;
            while (insertIdx > 0) {
                if (arr[insertIdx - 1] > curVal) {
                    arr[insertIdx] = arr[insertIdx - 1];
                    arr[insertIdx - 1] = curVal;
                }
                insertIdx--;
            }
        }
    }

    /*
        int insertIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            insertIdx = i;
            while (insertIdx > 0) {
                if (arr[insertIdx - 1] > temp) {
                    arr[insertIdx] = arr[insertIdx - 1];
                    arr[insertIdx - 1] = temp;
                }
                insertIdx--;
            }
        }
     */
}
