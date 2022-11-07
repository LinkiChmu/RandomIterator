import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    public static final Random RANDOM = new Random();
    int max;
    int min;

    public RandomsIterator(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        Integer randomNum = RANDOM.nextInt(max + 1 - min) + min;
        return randomNum;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("RandomsIterator does not support method remove().");
    }
}
