package ru.netology.service;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test void shouldReturn() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = 500;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }

}