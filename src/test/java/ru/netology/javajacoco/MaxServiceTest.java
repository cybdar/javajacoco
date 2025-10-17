package ru.netology.javajacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void shouldFindMaxIfA() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 3;

        int expected = a;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxIfB() {
        MaxService service = new MaxService();
        int a = 3;
        int b = 5;

        int expected = b;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxIfEqual() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 5;

        int expected = 5;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
