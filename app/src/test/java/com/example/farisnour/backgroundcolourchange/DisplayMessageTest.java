package com.example.farisnour.backgroundcolourchange;

import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class DisplayMessageTest {
    @Test
    public void checkGetMessage() {
        LocalDate today = LocalDate.of(2019, 5, 2);
        assertEquals("There are 4 days until Ramadan :)", MainActivity.getMessage(today));

        today = LocalDate.of(2019, 6, 4);
        assertEquals("Day 30 of Ramadan", MainActivity.getMessage(today));

        today = LocalDate.of(2019, 6, 12);
        assertEquals("Ramadan is now over :(", MainActivity.getMessage(today));
    }
}
