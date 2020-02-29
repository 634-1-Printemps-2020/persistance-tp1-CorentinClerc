package ch.hesge.cours634.counter;

import java.security.InvalidParameterException;

public class UpperLimitedPositiveCounter extends Counter {
    private int max;

    public UpperLimitedPositiveCounter(int init, int max) throws InvalidParameterException {
        super(init);
        checkCounter(init, max);
        this.max = max;
    }

    public UpperLimitedPositiveCounter(int max) throws InvalidParameterException {
        super();
        checkCounter(0, max);
        this.max = max;
    }

    private void checkCounter(int init, int max) throws InvalidParameterException{
        if(max < init || max < 0){
            throw new InvalidParameterException("Paramètre maximum invalide : " + max + " Pour l'init : " + init);
        }
    }

    @Override
    public void inc() throws CounterException {
        checkMax(1);
        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        // if(getValue() + step < 0){ throw new CounterException("Can't go in negatives"); } // Déjà def dans Counter
        checkMax(step);
        super.add(step);
    }

    private void checkMax(int step) throws CounterException {
        if(getValue() + step > max){ throw new CounterException("Can't increment counter, max value reached: " + max +" / current : "+ getValue() + " / step : " + step); }
    }
}
