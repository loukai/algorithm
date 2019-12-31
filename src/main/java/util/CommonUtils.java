package main.java.util;

/**
 * @author loukai
 * @date 2019/11/14 11:14
 */
public class CommonUtils {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}
