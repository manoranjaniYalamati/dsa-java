package org.practice.dsa.containsduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTwoTest {

    private ContainsDuplicateTwo containsDuplicateTwo = new ContainsDuplicateTwo();

    @Test
    void containsDuplicateBruteForceApproach() {
        Assertions.assertTrue(containsDuplicateTwo.containsDuplicateBruteForceApproach(new int[]{1,2,3,1}, 3));
        Assertions.assertFalse(containsDuplicateTwo.containsDuplicateBruteForceApproach(new int[]{1,2,3,1,2,3}, 2));
        Assertions.assertTrue(containsDuplicateTwo.containsDuplicateBruteForceApproach(new int[]{99,99}, 2));
    }

    @Test
    void containsDuplicateHashMapApproach() {
        Assertions.assertTrue(containsDuplicateTwo.containsDuplicateHashMapApproach(new int[]{1,2,3,1}, 3));
        Assertions.assertFalse(containsDuplicateTwo.containsDuplicateHashMapApproach(new int[]{1,2,3,1,2,3}, 2));
        Assertions.assertTrue(containsDuplicateTwo.containsDuplicateHashMapApproach(new int[]{99,99}, 2));
    }

    @Test
    void containsDuplicateSlidingWindowApproach() {
        Assertions.assertTrue(containsDuplicateTwo.containsDuplicateSlidingWindowApproach(new int[]{1,2,3,1}, 3));
        Assertions.assertFalse(containsDuplicateTwo.containsDuplicateSlidingWindowApproach(new int[]{1,2,3,1,2,3}, 2));
        Assertions.assertTrue(containsDuplicateTwo.containsDuplicateSlidingWindowApproach(new int[]{99,99}, 2));
    }
}