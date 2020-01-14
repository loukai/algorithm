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
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println();


        System.out.println(Arrays.toString(BubbleSort.sort(arr)));
        System.out.println(Arrays.toString(SelectSort.sort(arr)));
        System.out.println(Arrays.toString(InsertionSort.sort(arr)));
    }

}
