package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat; // Импорт assertThat из AssertJ
import static org.assertj.core.api.Assertions.withPrecision; // Импорт withPrecision из AssertJ

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92.0;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman172Then71p3() {
        short input = 172;
        double expected = 71.3;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
   }
}