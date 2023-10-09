package ru.netology.stats;


public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int getAverageSales(int[] sales) {
        int averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales = calculateSumSales(sales) / sales.length;
        }
        return averageSales;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int getHigherAverageSales(int[] sales) {
        int higherAverage = 0;
        int averageSales = calculateSumSales(sales) / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                higherAverage = i;
            }
        }
        return higherAverage + 1;
    }

    public int getBelowAverageSales(int[] sales) {
        int belowAverage = 0;
        int averageSales = calculateSumSales(sales) / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                belowAverage = i;
            }
        }
        return belowAverage + 1;
    }
}

