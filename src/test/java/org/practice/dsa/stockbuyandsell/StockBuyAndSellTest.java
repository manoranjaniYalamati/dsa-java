package org.practice.dsa.stockbuyandsell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class StockBuyAndSellTest {

    private final StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();

    @Test
    void getMaxProfitByBruteForce() {
        Assertions.assertEquals(5, stockBuyAndSell.getMaxProfitByBruteForce(new int[] {7,1,5,3,6,4}));
        Assertions.assertEquals(0, stockBuyAndSell.getMaxProfitByBruteForce(new int[] {7,6,4,3,1}));
    }

    @Test
    void getMaxProfitByGreedy() {
        Assertions.assertEquals(5, stockBuyAndSell.getMaxProfitByGreedy(new int[] {7,1,5,3,6,4}));
        Assertions.assertEquals(0, stockBuyAndSell.getMaxProfitByGreedy(new int[] {7,6,4,3,1}));

    }
}