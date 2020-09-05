package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = 100;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = 0;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn400() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1600;

        int actual = 400;
        int expected = service.remain(amount);

        assertEquals(expected, actual);
    }

}