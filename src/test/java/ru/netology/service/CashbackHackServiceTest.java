package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1010;

        int actual = 10;
        int expended = service.remain(amount);

        assertEquals(expended, actual);
    }

}