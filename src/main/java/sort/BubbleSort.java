package main.java.sort;

import main.java.util.CommonUtils;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度：O(N2)
 * 稳定性：稳定
 * <p>
 * 依次比较相邻两元素，若前一元素大于后一元素则交换之，直至最后一个元素即为最大；
 * 然后重新从首元素开始重复同样的操作，直至倒数第二个元素即为次大元素；
 * 依次类推。如同水中的气泡，依次将最大或最小元素气泡浮出水面。
 *
 * @author loukai
 * @date 2019/11/14 11:05
 */
public class BubbleSort{

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        //如果循环走完没有swap 说明已经正序 则跳出循环
        boolean isLoop = true;
        for (int i = arr.length; i > 0 && isLoop; i--) {
            isLoop = false;
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[j - 1]) {
                    CommonUtils.swap(arr, j, j - 1);
                    isLoop = true;
                }
            }
        }
        return arr;
    }

    public static void print(int[] arr,boolean isPrintArr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        long start = System.currentTimeMillis();
        int[] sortArr = sort(newArr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序 耗时:" + (end - start) + (isPrintArr?Arrays.toString(sortArr):""));
    }
}
