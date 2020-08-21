package main.java.sort;

import java.util.Arrays;

/**
 * 希尔排序 （插入排序升级版）  按一定步长分组，然后每组 进行插入排序
 *
 * @author loukai
 * @date 2020/1/14 13:10
 */
public class ShellSort {
    public static int[] sort(int[] arr){
        if(arr.length==0){return arr;}
        int gap = arr.length;
        while (gap>1){
            gap=gap/2;
            // 关键是 每次遍历的长度 取 gap
            for (int i= 0;i<gap;i++){
                InsertionSort.sort(arr,gap,i);
            }
        }
        return arr;
    }

    public static void print(int[] arr,boolean isPrintArr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        long start = System.currentTimeMillis();
        int[] sortArr = sort(newArr);
        long end = System.currentTimeMillis();
        System.out.println("希尔排序 耗时:" + (end - start) + (isPrintArr?Arrays.toString(sortArr):""));
    }
}
