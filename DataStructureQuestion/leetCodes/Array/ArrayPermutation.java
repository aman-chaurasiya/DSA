package DataStructureQuestion.leetCodes.Array;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int arr[]={1,2,5,5,4,5,4,584,54,5};
        int n= arr.length;
        int[] ints = buildArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] buildArray(int[] nums) {
        int []ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
            System.out.println(nums[i]+" "+nums[nums[i]]);
        }
        return ans;
    }
}
