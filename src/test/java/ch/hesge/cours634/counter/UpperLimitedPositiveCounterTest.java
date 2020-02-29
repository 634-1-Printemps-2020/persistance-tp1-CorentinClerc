package ch.hesge.cours634.counter;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {

    @Test (expected = CounterException.class)
    public void inc() throws CounterException {
        UpperLimitedPositiveCounter cpt = new UpperLimitedPositiveCounter(5,5);
        cpt.inc();
    }

    @Test (expected = CounterException.class)
    public void addNegative() throws CounterException {
        UpperLimitedPositiveCounter cpt = new UpperLimitedPositiveCounter(0,100);
        cpt.add(-100);
    }
    @Test (expected = CounterException.class)
    public void addHigher() throws CounterException {
        UpperLimitedPositiveCounter cpt = new UpperLimitedPositiveCounter(0,10);
        cpt.add(100);
    }
    // Tests Constructeurs
    @Test
    public void constructorNormal() throws InvalidParameterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 5);
    }
    @Test (expected = InvalidParameterException.class)
    public void constructorNegInit() throws InvalidParameterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(-10, 5);
    }
    @Test (expected = InvalidParameterException.class)
    public void constructorNegMax() throws InvalidParameterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(10, -5);
    }
    @Test (expected = InvalidParameterException.class)
    public void constructorMaxPlusPetit() throws InvalidParameterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(10, 5);
    }
}