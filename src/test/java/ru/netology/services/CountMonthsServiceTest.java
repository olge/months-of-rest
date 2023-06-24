package ru.netology.services;
import static org.junit.jupiter.api.Assertions.*;

public class CountMonthsServiceTest {
    @org.junit.jupiter.api.Test
    void testIncomeTenThousand() {
        CountMonthsService service = new CountMonthsService();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void testIncomeOneHundredThousand() {
        CountMonthsService service = new CountMonthsService();

        // подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

