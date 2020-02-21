package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int count;

    public Counter(int init){ this.count = init; }
    public Counter(){ this.count = 0; }

    @Override
    public void inc() throws CounterException {
        count++;
    }

    @Override
    public void add(int step) throws CounterException {
        count += step;
    }

    @Override
    public int getValue() {
        return count;
    }
}
