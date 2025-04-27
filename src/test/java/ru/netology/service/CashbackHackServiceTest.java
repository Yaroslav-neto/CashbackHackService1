package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @Test
    public void testRemainPay900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay900Api() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay1000Api() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay1001Api() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainPay1Api() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }
}