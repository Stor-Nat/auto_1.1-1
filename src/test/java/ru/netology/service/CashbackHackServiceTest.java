package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = 100;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = 1000;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;

        int actual = 400;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }

}