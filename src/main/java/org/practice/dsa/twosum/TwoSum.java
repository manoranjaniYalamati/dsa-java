package org.practice.dsa.twosum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] getTwoSumPairByBruteForce(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] getTwoSumPairByHasMap(int[] arr, int target)  {
        Map<Integer, Integer>  indexMap = new HashMap<>();

        for(int i=0;  i<arr.length; i++) {
            if(indexMap.containsKey(target - arr[i])) {
                return new int[] {i, indexMap.get(target - arr[i])};
            }
            else {
                indexMap.put(arr[i], i);
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] getTwoSumByTwoPointerApproach(int[] arr, int target) {
        int[][] pairs = new int[arr.length][2];

        for(int i=0; i<arr.length; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        int left=0;
        int right=arr.length-1;
        while(left<right) {
            int currSum = pairs[left][0] + pairs[right][0];
            if (currSum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            }
            else if(currSum < target){
                left++;
            }
            else {
                right++;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] a = new int[] {3,2,4};
        int[] result = getTwoSumByTwoPointerApproach(a, 6);
        System.out.println(Arrays.toString(result));
    }
}
