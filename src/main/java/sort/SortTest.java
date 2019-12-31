package main.java.sort;

import java.util.Arrays;

/**
 * @author loukai
 * @date 2019/11/15 9:55
 * @since v2.4
 */
public class SortTest {
    static int[] arr = {4,100,97,12,67,39,10,6,7,9,1,3,11,21,22,23,43,43,42,5,6,12,6,8};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(BubbleSort.sort(arr)));
    }
}
