package main.java.sort;

/**
 * 希尔排序
 * @author loukai
 * @date 2020/1/14 13:10
 */
public class ShellSort {
    public static int[] sort(int[] arr){
        if(arr.length==0){return arr;}
        int gap = arr.length;
        while (gap>1){
            gap=gap/2;
            for (int i =0;i<arr.length-gap;i++){
                InsertionSort.insert(arr,gap,i);
            }
        }
        return arr;
    }
}
