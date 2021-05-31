package Sort;

import java.util.Arrays;

public class BubbleSort {
    private int[] arr;
    private int len;

    public BubbleSort (int[] arr) {
        this.arr = arr;
        this.len = arr.length;
        sort();
    }

    private void sort() {
        int temp;
        for (int i = this.len-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.arr[j] > this.arr[j+1]) {
                    temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(this.arr));
    }

}
