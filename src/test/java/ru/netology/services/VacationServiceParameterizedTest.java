package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.VacationService;

public class VacationServiceParameterizedTest {
    @ParameterizedTest
    // @CsvSource({
//            "100000,60000,150000,2",
    //           "10000,3000,20000,3"
    //  })
    @CsvFileSource(files = "src/test/resources/Vacation.csv")


    public void shouldCalcVacationСonditions(int income, int expenses, int threshold, int expected) {
        VacationService services = new VacationService();

        int actual = services.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}