package ru.netology.stats;

public class StatsService {
    // 1. Сумма всех продаж
    public long amountSales(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount;
    }

    // 2. Средняя сумма продаж в месяц
    public long averageAmountSales(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount / sales.length;
    }

    // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего (см. п.2)
    public int belowAverageSales(long[] sales, long averageAmount) {
        int countMin = 0;
        for (long sale : sales) {
            if (sale < averageAmount) {
                countMin++;
            }
        }
        return countMin;
    }


    // 6. Количество месяцев, в которых продажи были выше среднего (см. п.2)
    public int aboveAverageSales(long[] sales, long averageAmount) {
        int countMax = 0;
        for (long sale : sales) {
            if (sale > averageAmount) {
                countMax++;
            }
        }
        return countMax;
    }

}
