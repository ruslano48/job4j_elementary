package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void whenPointsAreSameThenDistanceIsZero() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double result = a.distance(b);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void whenPointsAreVerticalThenDistanceIsCorrect() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void whenPointsAreHorizontalThenDistanceIsCorrect() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        double result = a.distance(b);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    public void whenPointsAreDiagonalThenDistanceIsCorrect() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double result = a.distance(b);
        assertEquals(5.0, result, 0.001);
    }
}