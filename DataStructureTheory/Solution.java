package DataStructureTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static void main(String[] args) {
        int nums[]={9,7,5,3,6};
        int k=6;
        System.out.println(canPair(nums,k));;
        System.out.println(Math.floor(5/2));
    }
    public static boolean canPair(int[] nums,int k){
        int count=0;
        int n=nums.length;
        boolean visited[]=new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((nums[i]+nums[j])%k==0 && !visited[i] && !visited[j]){

                    count++;
                    visited[i]=true;
                    visited[j]=true;
                }
            }

        }
       return count==Math.ceil( n/2) ? true:false;
    }

}
