package 排序算法.冒泡排序;


/**
 * 以此给给个数字进行排序
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 4, 77, 22, 434, 66, 434, 5, 5, 23, 554, 2232, 556, 1212, 312312, 312};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * 冒泡排序
     */
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*
     for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
     */
}
