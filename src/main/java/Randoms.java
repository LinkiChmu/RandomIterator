import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected int max;
    protected int min;

    public Randoms(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(max, min);
    }
}
