package main.java.sort;

import main.java.util.CommonUtils;

/**
 * 插入排序（类似于插队，后面排队的人依次往后移动一格）
 * 假设第一个元素为已排好序的元素。然后第二个元素值（当前值）依次往前比较，
 * 如果小于则前一个元素往后移动一个索引位置，直到大于然后把当前索引位置(被比较的值的位置)赋值当前值，此次遍历结束。
 * 插入排序
 * @author loukai
 * @date 2020/1/13 14:29
 */
public class InsertionSort {
    public static int[] sort(int[] arr){
        if (arr.length==0){ return arr;}
        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j>0;j--){
                if (arr[j]>arr[j-1]){
                    arr[j] = arr[i+1];
                    break;
                }
                arr[j]=arr[j-1];
            }
        }
        return arr;
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
