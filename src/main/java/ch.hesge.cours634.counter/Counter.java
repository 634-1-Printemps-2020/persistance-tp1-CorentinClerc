package ch.hesge.cours634.counter;

import java.security.InvalidParameterException;

public class Counter implements ICounter {
    private int value;

    public Counter(int init) throws InvalidParameterException {
        checkMinCounterInit(init);
        this.value = init;
    }

    public Counter(){
        // Pas besoin de check ici du coup :thinking:
        this.value = 0;
    }

    private void checkMinCounterInit(int init) throws InvalidParameterException {
        if(init < 0){ throw new InvalidParameterException(); }
    }

    @Override
    public void inc() throws CounterException {
        value++;
    }

    @Override
    public void add(int step) throws CounterException {
        if(value + step < 0){ throw new CounterException("Can't go in negatives : current : " + value + " / step : " + step); }
        value += step;
    }

    @Override
    public int getValue() {
        return value;
    }
}
