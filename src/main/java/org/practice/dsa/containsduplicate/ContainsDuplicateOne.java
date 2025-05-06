package org.practice.dsa.containsduplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicateOne {
    public boolean containsDuplicateBruteforceApproach(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateSortApproach(int[] nums) {
         Arrays.sort(nums);
         for(int i=0; i<nums.length-1; i++) {
             if(nums[i] == nums[i+1]) return true;
         }
         return false;
    }

    public boolean containsDuplicateHashMapApproach(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
         for(int i=0; i<nums.length; i++) {
             if(map.get(nums[i]) != null) return true;
             map.put(nums[i], i);
         }
         return false;
    }

    public boolean containsDuplicateHashSetApproach(int[] nums) {
        return !(nums.length == new HashSet<Integer>(Arrays.stream(nums).boxed().toList()).size());
    }
}
