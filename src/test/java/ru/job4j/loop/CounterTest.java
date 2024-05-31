package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart1ToFinish4Then10() {
        int start = 1;
        int finish = 4;
        int expected = 10;
    }

    @Test
    void whenStart2ToFinish8Then36() {
        int start = 2;
        int finish = 8;
        int expected = 36;
    }

    @Test
    void whenStart10Tofinish2Then0() {
        int start = 10;
        int finish = 2;
        int expented = 0;
    }
}
