package main.java.sort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author loukai
 * @date 2019/11/15 9:55
 * @since v2.4
 */
public class SortTest {
    static int[] arr =new int[100];

    public static void main(String[] args) {
        Random r = new Random(1);
        for (int i =0;i<100;i++){
            int random = r.nextInt(101);
            arr[i]=random;
        }
        System.out.println("原数组:"+Arrays.toString(arr));
        System.out.println();
        System.out.println();


        System.out.println("冒泡排序  :"+Arrays.toString(BubbleSort.sort(Arrays.copyOf(arr,arr.length))));
        System.out.println("选择排序  :"+Arrays.toString(SelectSort.sort(Arrays.copyOf(arr,arr.length))));
        System.out.println("插入排序  :"+Arrays.toString(InsertionSort.sort(Arrays.copyOf(arr,arr.length))));
        System.out.println("my插入排序:"+Arrays.toString(InsertionSort.mySort(Arrays.copyOf(arr,arr.length))));
        System.out.println(Arrays.toString(ShellSort.sort(Arrays.copyOf(arr,arr.length))));
    }

}
