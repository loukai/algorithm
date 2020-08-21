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

    static final int COUNT = 50000;

    static int[] arr =new int[COUNT];

    public static void main(String[] args) {
        Random r = new Random(111);
        for (int i =0;i<COUNT;i++){
            int random = r.nextInt(1000);
            arr[i]=random;
        }
//        System.out.println("原数组:"+Arrays.toString(arr));
        System.out.println();
        System.out.println();
        boolean isShow = false;
        BubbleSort.print(arr,isShow);
        InsertionSort.print(arr,isShow);
        SelectSort.print(arr,isShow);
        ShellSort.print(arr,isShow);


    }

}
