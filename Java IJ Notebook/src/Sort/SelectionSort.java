package Sort;

import java.util.Arrays;

public class SelectionSort {
    private int len;
    private int[] arr;

    public SelectionSort (int[] arr) {
        this.len = arr.length;
        this.arr = arr;
        sort();
    }

    public void sort() {
        int min;

        for (int i = 0; i < this.len-1; i++) {  // 0 ~ 6; arr.len = 8
            min = i;

            for (int j = i+1; j < this.len; j++) {  // 1 ~ 7; arr.len = 8
                if (this.arr[min] > this.arr[j]) {
                    min = j;
                }
            }

            // Swap
            int temp = this.arr[i];
            this.arr[i] = this.arr[min];
            this.arr[min] = temp;
        }

        System.out.println(Arrays.toString(this.arr));
    }
}
