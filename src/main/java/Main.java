import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long averageAmount = service.averageAmountSales(sales);
        System.out.println("1. Сумма всех продаж: " + service.amountSales(sales));
        System.out.println("2. Средняя сумма продаж в месяц: " + service.averageAmountSales(sales));
        System.out.println("3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму: " + service.maxSales(sales));
        System.out.println("4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму: " + service.minSales(sales));
        System.out.println("5. Количество месяцев, в которых продажи были ниже среднего: " + service.belowAverageSales(sales, averageAmount));
        System.out.println("6. Количество месяцев, в которых продажи были выше среднего: " + service.aboveAverageSales(sales, averageAmount));

    }
}