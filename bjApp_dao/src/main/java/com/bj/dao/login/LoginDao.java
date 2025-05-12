package com.bj.dao.login;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class LoginDao {



    /**
     *给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
     *
     * 你可以按任意顺序返回答案
     *
     */
    public static int[] towSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] != nums[j] && (nums[i] + nums[j]) == target) {
                    return new int[]{i,j};
                }
            }


        }
        return new int[]{};
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;

       /* HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int []{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }

        return null;*/
    }

    /**
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     *
     * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
     *
     *
     *
     * 示例 1:
     *
     * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * 示例 2:
     *
     * 输入: strs = [""]
     * 输出: [[""]]
     * 示例 3:
     *
     * 输入: strs = ["a"]
     * 输出: [["a"]]
     */


    public static List<List<String>> groupData(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        for (String s : map.keySet()) {
            res.add(map.get(s));
        }

        return res;
    }

    /**
     * 示例 1：
     *
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     * 示例 2：
     *
     * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
     * 输出：9
     * 示例 3：
     *
     * 输入：nums = [1,0,1,2]
     * 输出：3
     */

 /*   public static void main(String[] args) {
        int res = res(new int[]{1,0,1,2});
        System.out.println(res);

    }*/
    public static int res(int[] nums){

        Arrays.sort(nums);
        int max = 0;
        int current = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left =  nums[i];
                current = 1;
                max = 1;
            } else {
                if (left == nums[i]) {
                    continue;
                }
               if (nums[i] == left +1) {
                   current ++ ;
                   if (max < current) {
                       max = current;
                   }
               } else {
                   if (max < current) {
                       max = current;
                   }
                   current = 1;
               }
                left = nums[i];
            }

        }
        return max;

    }

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     *
     *
     *
     * 示例 1:
     *
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 示例 2:
     *
     * 输入: nums = [0]
     * 输出: [0]
     * @param
     */
    public static void main(String[] args) {
        moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
        System.out.println();
    }
    public static int[] moveZeroes(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i+1;
                j = needCompareNum(j, nums);
                if (j == -1) {
                    return nums;
                }
                int a = nums[i]; int b = nums[j];
                nums[i] = b;
                nums[j] = a;

            }
        }
        return nums;

    }

    private static int needCompareNum(int j, int[] nums) {
        if (j == nums.length) {
            return -1;
        }
        if (nums[j] != 0) {
            return j;
        }


        return needCompareNum(++j,nums);


    }

    /**
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     *
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 返回容器可以储存的最大水量。
     *[1,8,6,2,5,4,8,3,7]
     * 说明：你不能倾斜容器。
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;
        int max = 0;
        while (left < right) {
            int lh = height[left];
            int rh = height[right];
            int h = rh > lh? lh : rh;
            int v = h * (right - left);
            if (max < v) {
                max = v;
            }
            if (rh > lh) {
                left = left + 1;
            } else if (rh < lh) {
                right = right -1;
            } else {
                if (height[right-1] > height[left+1]) {
                    right = right -1;
                } else {
                    left = left + 1;
                }

            }

        }


        return max;
    }

    /**
     * 给你一个整数数组 nums ，判断是否存在三元组
     * [nums[i], nums[j], nums[k]]
     * 满足 i != j、i != k 且 j != k ，
     * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     *
     */

    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
        }
        Integer[] objects = (Integer[]) list.toArray();
        Arrays.sort(objects);

        return null;

    }



}
