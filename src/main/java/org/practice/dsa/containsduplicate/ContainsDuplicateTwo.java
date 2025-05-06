package org.practice.dsa.containsduplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicateTwo {
    public boolean containsDuplicateBruteForceApproach(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateHashMapApproach(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && Math.abs(index - i) <= k) return true;
            else map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsDuplicateSlidingWindowApproach(int[] nums, int k) {
        if (k == 0) return false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            if (i >= k) set.remove(nums[i - k]);
            set.add(nums[i]);
        }
        return false;
    }

}
