package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter implements ICounter {
    private int count, max;

    public UpperLimitedPositiveCounter(int init, int max){
        this.count = init;
        this.max = max;
    }

    public UpperLimitedPositiveCounter(int max){
        this.count = 0;
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        if(count + 1 > max) {
            throw new CounterException("Can't increment counter, max value reached");
        }
        count++;
    }

    @Override
    public void add(int step) throws CounterException {
        if(step < 0){ throw new CounterException("Can't go in negatives"); }
        if(count + step > max){ throw new CounterException("Can't increment counter, max value reached"); }
        count += step;
    }

    @Override
    public int getValue() {
        return count;
    }
}
