package main.java.leetcode.everyday;

import java.util.Arrays;

/**
 *
 *  有多少小于当前数字的数字
 *
 * 给你一个数组nums，对于其中每个元素nums[i]，请你统计数组中比它小的所有数字的数目。
 *
 * 换而言之，对于每个nums[i]你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 *
 * 以数组形式返回答案。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [8,1,2,2,3]
 * 输出：[4,0,1,1,3]
 * 解释：
 * 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
 * 对于 nums[1]=1 不存在比它小的数字。
 * 对于 nums[2]=2 存在一个比它小的数字：（1）。
 * 对于 nums[3]=2 存在一个比它小的数字：（1）。
 * 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
 *
 * 提示：
 *
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author loukai
 * @date 2020/10/27
 */
public class SmallerNumbersThanCurrent {

//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int length = nums.length;
//        int[] result = new int[length];
//        for (int i=0;i< length;i++){
//            for (int j=0;j< length;j++){
//                if (nums[j]<nums[i]){
//                    result[i]++;
//                }
//            }
//        }
//        return result;
//    }


    /**
     *
     * 1. 定义一个索引计数数组arrCount（大小为最原数组里可能出现的最大值加一）
     * 2. 遍历原数组nums 找到对应nums[i]值的arrCount索引，并把值arrCount[nums[i]]加一 (这里是统计对应索引出现的次数)
     * 3. 查找arrCount[]值大于1的，然后统计前面的个数count 并设置到对应计数数组索引的值里（这步就确定了小于对应值的个数）
     * 4. 遍历原数组nums 从arrCount里查找小于对应值出现的个数。
     * @param nums
     * @return
     */

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int length = nums.length;
        //用于计数的数组  （空间换时间）
        int[] arrCount = new int[101];

        // 将nums的值对应到计数数组的索引上，并把值+1
        for (int i = 0; i < length; i++) {
            arrCount[nums[i]]++;
        }
        //用来判断前面有几个（前面有几个就是有几个小于当前数字的）。
        int count = 0;

        for (int i = 0; i < arrCount.length; i++) {
            if (arrCount[i]>0){
                int temp = arrCount[i];
                arrCount[i]=count;
                count+=temp;
            }
        }
        for (int i = 0; i < length; i++) {
            nums[i]= arrCount[nums[i]];
        }
        return nums;
    }

    public static void main(String[] args) {
    int[] resp = smallerNumbersThanCurrent(new int[]{2,2,90,1});
        System.out.print(Arrays.toString(resp));
    }
}
