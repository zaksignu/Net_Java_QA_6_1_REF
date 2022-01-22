package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void minSales() {
        int expected = 1;
        StatsService srv = new StatsService();
        long[] time = {1,2,3};


        assertEquals(expected,srv.minSales(time));
    }
}