package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EmployeeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Employee.csv")
    public void testMonthsOff(int income, int expense, int threshold, int expected) {
        EmployeeService service = new EmployeeService();
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
