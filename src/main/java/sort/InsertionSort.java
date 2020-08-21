package main.java.sort;

import main.java.util.CommonUtils;

import java.util.Arrays;

/**
 * 插入排序（类似于插队，后面排队的人依次往后移动一格）
 * 假设第一个元素为已排好序的元素。然后第二个元素值（当前值）依次往前比较，
 * 如果小于则前一个元素 则前面元素往后移动一个索引位置，直到大于然后把当前索引位置(被比较的值的位置)赋值当前值，此次遍历结束。
 * 插入排序
 * @author loukai
 * @date 2020/1/13 14:29
 *
 *
 * 4 5 1 2 9 3 6
 *
 */
public class InsertionSort {
    public static int[] sort(int[] arr){
        return sort(arr,1,0);
    }

    public static void print(int[] arr,boolean isPrintArr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        long start = System.currentTimeMillis();
        int[] sortArr = sort(newArr);
        long end = System.currentTimeMillis();
        System.out.println("插入排序 耗时:" + (end - start) + (isPrintArr?Arrays.toString(sortArr):""));
    }

    /**
     *
     * @param arr 数组
     * @param gap 步长
     * @param start 开始位置
     */
    public static int[] sort(int[] arr,int gap,int start){
        if (arr.length<2){ return arr;}

        for (int i = start+gap;i<arr.length;i+=gap){
            insert(arr,gap,i,start);
        }
        return arr;
    }

    /**
     *
     * @param arr 数组
     * @param gap 步长
     * @param i 当前比较元素的位置
     * @param start 开始位置
     */
    public static void insert(int[]arr , int gap , int i,int start){
        int value = arr[i];
        int j =i-gap;
        for (;j>=start&&value<arr[j];j-=gap){
            arr[j+gap]=arr[j];
        }
        arr[j+gap] = value;
    }

    /**
     * 假设第一个元素为已排好序的元素。然后第二个元素值往前比较，如果小于则索引替换，直到大于为止。
     * 然后后面遍历是在上一次排好序的基础，后面的一个元素执行上面操作。
     * @param arr
     * @return
     */
    public static int[] mySort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j>0;j--){
                if (arr[j]>arr[j-1]){
                    break;
                }
                CommonUtils.swap(arr,i,j);
            }
        }
        return arr;
    }
}
