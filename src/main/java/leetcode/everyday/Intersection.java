package main.java.leetcode.everyday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 349. 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *  
 *
 * 说明：
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * @author loukai
 * @date 2020/11/2
 */
public class Intersection {

    public int[] intersection1(int[] nums1, int[] nums2) {
        if (nums1==null||nums2==null){
            return null;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        if (nums1==null||nums2==null){
            return null;
        }
        Set<Integer> set1 = new HashSet<>(nums1.length);
        for (int i : nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>(nums1.length);
        for (int i : nums2) {
            set2.add(i);
        }
        return getIntersection(set1,set2);
    }

    public int[] intersection3(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0,index = 0,index2=0;
        int[] intersection = new int[nums1.length];
        while (index1<nums1.length&&index2<nums2.length){
            if (nums1[index1]==nums2[index2]){
                if (index==0||intersection[index-1]!=nums1[index1]){
                    intersection[index++]=nums1[index1];
                    index++;
                }
                index1++;
                index2++;
            }else if (nums1[index1]<nums2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection,0,index);
    }
    private int[] getIntersection(Set<Integer> set1,Set<Integer> set2){
        if (set1.size()>set2.size()){
            return getIntersection(set2,set1);
        }
        Set<Integer> respSet = new HashSet<>();
        set1.forEach(key->{
            if (set2.contains(key)){
                respSet.add(key);
            }
        });

        int[] resp = new int[respSet.size()];
        int index = 0;
        for (int i : respSet) {
            resp[index++]=i;
        }
        return resp;
    }
}
