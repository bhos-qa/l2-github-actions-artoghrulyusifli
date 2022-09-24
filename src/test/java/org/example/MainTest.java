package org.example;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @DisplayName("Test Main.get()")
    @Test
    void testGet() {
        assertEquals("ARTOGHRUL", Main.get());
    }

}
