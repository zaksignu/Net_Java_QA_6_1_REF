package ru.netology.stats;

public class StatsService {

    //1. Сумма всех продаж
    public int wholeSalesSumm(long[] sales) {
        int summ = 0;
        for (long sale : sales) {
            summ += sale;
        }
        return summ;
    }

    //2. Средняя сумма продаж в месяц
    public int averageSalesSumm(long[] sales) {
        int summ = 0;
        for (long sale : sales) {
            summ += sale;
        }
        summ = summ / sales.length;
        return summ;
    }

    //3.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //4.Номер месяца, в котором был максимум продаж (осуществлены продажи на минимальную сумму)*
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    //6. Количество месяцев с продажами выше среднего
    public int moreAverageSales(long[] sales, long avrgSumm) {
        int month = 0;
        for (long sale : sales) {
            if (sale > avrgSumm) {
                month++;
            }
        }
        return month;
    }
    //6. Количество месяцев с продажами ниже среднего
    public int lessAverageSales(long[] sales, long avrgSumm) {
        int month = 0;
        for (long sale : sales) {
            if (sale < avrgSumm) {
                month++;
            }
        }
        return month;
    }
}
