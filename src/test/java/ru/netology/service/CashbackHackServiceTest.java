package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    @Test
    public void shouldRemain100Amount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0Amount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain999Amount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain1Amount2999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2999;
        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void shouldRemain100Amount900Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0Amount1000Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain999Amount1001Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain1Amount2999Junit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2999;
        int expected = 1;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }


}

