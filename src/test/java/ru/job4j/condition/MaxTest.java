package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To4Then5() {
        int left = 5;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To20Then20() {
        int left = 10;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxOfTwoNumbersThenReturnMax() {
        int result = Max.max(10, 5);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void whenMaxOfTwoNumbersThenReturnMax2() {
        int result = Max.max(5, 10);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void whenMaxOfThreeNumbersThenReturnMax() {
        int result = Max.max(10, 5, 20);
        assertThat(result).isEqualTo(20);
    }

    @Test
    public void whenMaxOfThreeNumbersWithNegative() {
        int result = Max.max(-10, -5, -20);
        assertThat(result).isEqualTo(-5);
    }

    @Test
    public void whenMaxOfFourNumbersThenReturnMax() {
        int result = Max.max(10, 5, 20, 15);
        assertThat(result).isEqualTo(20);
    }

    @Test
    public void whenMaxOfFourNumbersWithNegatives() {
        int result = Max.max(-10, -5, -20, -15);
        assertThat(result).isEqualTo(-5);
    }

    @Test
    public void whenAllNumbersAreEqual() {
        int result = Max.max(5, 5, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void whenAllFourNumbersAreEqual() {
        int result = Max.max(5, 5, 5, 5);
        assertThat(result).isEqualTo(5);
    }
}