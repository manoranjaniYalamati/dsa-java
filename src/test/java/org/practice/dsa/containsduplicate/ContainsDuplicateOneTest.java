package org.practice.dsa.containsduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateOneTest {
    ContainsDuplicateOne containsDuplicateOne = new ContainsDuplicateOne();

    @Test
    void containsDuplicateBruteforceApproach() {
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateBruteforceApproach(new int[]{1,2,3,1}));
        Assertions.assertFalse(containsDuplicateOne.containsDuplicateBruteforceApproach(new int[]{1,2,3,4}));
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateBruteforceApproach(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    void containsDuplicateSortApproach() {
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateSortApproach(new int[]{1,2,3,1}));
        Assertions.assertFalse(containsDuplicateOne.containsDuplicateSortApproach(new int[]{1,2,3,4}));
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateSortApproach(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    void containsDuplicateHashMapApproach() {
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateHashMapApproach(new int[]{1,2,3,1}));
        Assertions.assertFalse(containsDuplicateOne.containsDuplicateHashMapApproach(new int[]{1,2,3,4}));
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateHashMapApproach(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    void containsDuplicateHashSetApproach() {
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateHashSetApproach(new int[]{1,2,3,1}));
        Assertions.assertFalse(containsDuplicateOne.containsDuplicateHashSetApproach(new int[]{1,2,3,4}));
        Assertions.assertTrue(containsDuplicateOne.containsDuplicateHashSetApproach(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}