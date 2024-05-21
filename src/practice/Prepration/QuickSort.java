package practice.Prepration;

public class QuickSort {
    public static void swap(int[] a, int b, int c) {
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    public static int partition(int[] a, int start, int end) {
        int value = a[start];
        int i = start;
        for(int j = start; j <= end; j++) {
            if(a[j] < value) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i, start);
        return i;
    }

    public static void quickSort(int[] a, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = partition(a, start, end);
        quickSort(a, start, mid - 1);
        quickSort(a,mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,67,212145,5,56,1,2};
        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
