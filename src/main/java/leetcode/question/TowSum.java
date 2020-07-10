package main.java.leetcode.question;

import java.util.HashMap;
import java.util.Map;

/**
 *  两数之和
 * 难度 ：简单
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 解题思路：
 * 1.暴力法两次循环 时间复杂度 O(n2) 比较简单
 * 2.哈希图解法: 把 target-nums[i]当作key ,索引当作value 存进map里
 * 然后判断后面的nums[i]存在map的key里 存在就找到这两个值了，不存在继续遍历。
 *
 * @author loukai
 * @date 2020/6/24 13:22
 */
public class TowSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap(nums.length);
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }
        return new int[1];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 10;
        int[] indexs = twoSum(nums,target);
        System.out.print(indexs[0] +","+indexs[1]);
    }
}
