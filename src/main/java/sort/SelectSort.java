package main.java.sort;

import main.java.util.CommonUtils;

/**
 * 选择排序
 * 时间复杂度：O(N2) 　　
 * 稳定性：稳定
 * 初始化一个最小化索引为首元素位置，依次和后面比较如果较大则更新最小索引。
 * 遍历一遍后交换首元素和最小索引指向的元素。后面依次类推
 * @author loukai
 * @date 2019/11/15 10:17
 */
public class SelectSort {
    public static int[] sort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            int minIndex =i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if (i!=minIndex){
                CommonUtils.swap(arr,i,minIndex);
            }
        }
        return arr;
    }
}
