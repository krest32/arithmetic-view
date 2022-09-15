package 排序算法.归并排序;

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
            int mid = (left + right) >> 1;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        int p1 = left, p2 = mid + 1, k = left;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {
                temp[k++] = arr[p1++];
            } else {
                temp[k++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            temp[k++] = arr[p1++];
        }
        while (p2 <= right) {
            temp[k++] = arr[p2++];
        }
        if (right + 1 - left >= 0) {
            System.arraycopy(temp, left, arr, left, right + 1 - left);
        }
    }





    /*
        private static void sort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) >> 1;
                sort(arr, left, mid);
                sort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] a, int left, int mid, int right) {
            // 辅助数组
            int[] tmp = new int[a.length];
            // p1、p2是检测指针，k是存放指针
            int p1 = left, p2 = mid + 1, k = left;

            while (p1 <= mid && p2 <= right) {
                if (a[p1] <= a[p2]) {
                    tmp[k++] = a[p1++];
                } else {
                    tmp[k++] = a[p2++];
                }
            }
            while (p1 <= mid) {
                // 如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
                tmp[k++] = a[p1++];
            }
            while (p2 <= right) {
                tmp[k++] = a[p2++];
            }
            // 复制回原素组
            if (right + 1 - left >= 0) {
                System.arraycopy(tmp, left, a, left, right + 1 - left);
            }
        }
     */
}
