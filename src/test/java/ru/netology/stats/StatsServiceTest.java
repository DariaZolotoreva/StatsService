package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {15, 45, 85, 47, 2, 100};
        long expectedTotalSales = 294;
        long actualTotalSales = service.totalSales(sales);
        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {15, 45, 85, 47, 2, 100};
        long expectedAverageSales = 49;
        long actualAverageSales = service.averageSales(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldCalculateMonthsSalesUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {15, 45, 85, 47, 2, 100};
        long expectedMonthsCount = 4;
        long actualMonthsCount = service.monthsSalesUnderAverage(sales);
        Assertions.assertEquals(expectedMonthsCount, actualMonthsCount);
    }

    @Test
    public void shouldCalculateMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {15, 45, 85, 47, 2, 100};
        long expectedMonthsCount = 2;
        long actualMonthsCount = service.monthsSalesAboveAverage(sales);
        Assertions.assertEquals(expectedMonthsCount, actualMonthsCount);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {15, 45, 85, 47, 2, 100};
        long expectedMonth = 5;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {15, 45, 85, 47, 2, 100};
        long expectedMonth = 6;
        long actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }
}

