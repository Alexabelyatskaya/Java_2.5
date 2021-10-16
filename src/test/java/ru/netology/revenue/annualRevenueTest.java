package ru.netology.revenue;

import org.junit.jupiter.api.Test;
import ru.netology.revenue.annualRevenue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnnualRevenueTest {

    @Test
    void calculateSum() {
        annualRevenue service = new annualRevenue();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        annualRevenue service = new annualRevenue();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maximumValue() {
        annualRevenue service = new annualRevenue();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maximumValue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minimumValue() {
        annualRevenue service = new annualRevenue();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minimumValue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void lessThanAverage() {
        annualRevenue service = new annualRevenue();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThanAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void moreThanAverage() {
        annualRevenue service = new annualRevenue();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThanAverage(sales);

        assertEquals(expected, actual);
    }
}
