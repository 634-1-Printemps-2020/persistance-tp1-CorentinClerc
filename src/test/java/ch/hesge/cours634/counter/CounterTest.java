package ch.hesge.cours634.counter;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void inc() throws CounterException {
        Counter counter = new Counter();
        counter.inc();
        Assert.assertEquals(1, counter.getValue());
    }

    @Test
    public void add() throws CounterException {
        Counter counter = new Counter();
        counter.add(5);
        Assert.assertEquals(5, counter.getValue());
    }

    @Test
    public void getValue() {
        Counter counter = new Counter(10);
        Assert.assertNotNull(counter);
        Assert.assertEquals(10, counter.getValue());
    }

    @Test (expected = InvalidParameterException.class)
    public void constructor(){
        Counter counter = new Counter(-10);
    }
}