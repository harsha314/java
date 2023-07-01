package Concurrency;

import java.util.Arrays;

public class MultithreadedMergeSort {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 5, 6, 7, 1, 2} ;
        mergeSort(arr1, 0, arr1.length - 1);
        Arrays.stream(arr1).forEach(System.out::println);
    }

    public static void mergeSort(int[] arr, int l, int r) {

        if(l >= r)
            return ;

        int mid = (l + r) / 2 ;

        Thread t1 = new Thread(() -> { mergeSort(arr, l, mid); });
        Thread t2 = new Thread(() -> { mergeSort(arr, mid + 1, r); });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        merge(arr, l, mid, r) ;

    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int i = l , j = mid + 1 , k = l ;
        int[] copyOfArr = Arrays.copyOfRange(arr, l, r + 1);
        while(i <= mid && j <= r) {
            if(copyOfArr[i - l] < copyOfArr[j - l]) {
                arr[k++] = copyOfArr[i - l] ;
                ++i ;
            }
            else {
                arr[k++] = copyOfArr[j - l] ;
                ++j;
            }
        }
        while(i <= mid) {
            arr[k++] = copyOfArr[i - l] ;
            ++i;
        }
        while(j <= r) {
            arr[k++] = copyOfArr[j - l] ;
            ++j;
        }

    }
}
