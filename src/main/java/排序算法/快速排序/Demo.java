package 排序算法.快速排序;

/**
 * 大量数据优先选择排序法
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 0, 1, 0, 6, 1, 3};
        sort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionNum = getPartitionNum(arr, left, right);
            sort(arr, left, partitionNum);
            sort(arr, partitionNum + 1, right);
        }
    }

    private static int getPartitionNum(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }


    /**
     * 快速排序，利用利用递归， 右边的数字全部比 pivot大, 坐标的数字全部比 pivot 小
     */




    /*
        private static void sort(int[] arr, int left, int right) {
            if (left == right) {
                return;
            }
            int partitionNum = partitionNum(arr, left, right);
            sort(arr, left, partitionNum);
            sort(arr, partitionNum + 1, right);
        }

        private static int partitionNum(int[] arr, int left, int right) {
            int pivot = arr[left];
            while (left < right) {
                while (left < right && arr[right] >= pivot) {
                    right--;
                }
                arr[left] = arr[right];
                while (left < right && arr[left] < pivot) {
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[left] = pivot;

            return left;
        }
     */
}
