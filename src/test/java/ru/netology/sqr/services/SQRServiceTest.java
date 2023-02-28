package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/Resources/SQRTestNORM.csv")
    public void testDifferentRange(int expected, int low, int high) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(low, high);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest

    @CsvFileSource(files = "src/test/Resources/SQRTestBorders.csv")
    public void testBoarderRange(int expected, int low, int high) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(low, high);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest

    @CsvFileSource(files = "src/test/Resources/SQRTestOutOfRange.csv")
    public void testOutOfRange(int expected, int low, int high) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(low, high);

        Assertions.assertEquals(expected, actual);
    }

}
