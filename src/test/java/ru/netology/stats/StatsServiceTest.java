package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void minSales() {
        int expected = 9;
        StatsService srv = new StatsService();
        long[] salesInTime = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = srv.minSales(salesInTime);
        assertEquals(expected, actual);
    }

    @Test
    void wholeSalesSumm() {
        int expected = 180;
        StatsService srv = new StatsService();
        long[] salesInTime = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = srv.wholeSalesSumm(salesInTime);
        assertEquals(expected, actual);
    }

    @Test
    void averageSalesSumm() {
        int expected = 15;
        StatsService srv = new StatsService();
        long[] salesInTime = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = srv.averageSalesSumm(salesInTime);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        int expected = 8;
        StatsService srv = new StatsService();
        long[] salesInTime = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = srv.maxSales(salesInTime);
        assertEquals(expected, srv.maxSales(salesInTime));
    }

    @Test
    void moreAverageSales() {
        int expected = 5;
        StatsService srv = new StatsService();
        long[] salesInTime = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = srv.moreAverageSales(salesInTime);
        assertEquals(expected, actual);
    }

    @Test
    void lessAverageSales() {
        int expected = 5;
        StatsService srv = new StatsService();
        long[] salesInTime = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = srv.lessAverageSales(salesInTime);
        assertEquals(expected, actual);
    }
}
