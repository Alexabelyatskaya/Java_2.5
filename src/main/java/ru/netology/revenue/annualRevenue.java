package ru.netology.revenue;

public class annualRevenue {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int average = calculateSum(sales) / sales.length;

        return average;
    }

    public int maximumValue(int[] sales) {
        int maxValue = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxValue]) {
                maxValue = month;
            }
            month += 1;
        }
        return maxValue + 1;
    }

    public int minimumValue(int[] sales) {
        int minValue = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < sales[minValue]) {
                minValue = month;
            }
            month += 1;
        }
        return minValue + 1;
    }

    public int lessThanAverage(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                counter += 1;
            }
        }
        return counter;
    }

    public int moreThanAverage(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                counter += 1;
            }
        }
        return counter;
    }
}