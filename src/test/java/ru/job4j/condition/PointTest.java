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

    @Test
    public void whenDistance3dIsZero() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 0, 0);
        double result = p1.distance3d(p2);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void whenDistance3dIsOne() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 1, 0);
        double result = p1.distance3d(p2);
        assertEquals(1, result, 0.01);
    }

    @Test
    public void whenDistance3dIsSqrt3() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(1, 1, 1);
        double result = p1.distance3d(p2);
        assertEquals(Math.sqrt(3), result, 0.01);
    }
}