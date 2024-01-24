package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/count.csv")
    public void test (int income, int expenses, int treshold, int expected) {
        CalcService service = new CalcService();
        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected, actual);
    }
}
