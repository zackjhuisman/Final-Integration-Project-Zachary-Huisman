import java.util.*;

public class randomRange {
    // set up an arraylist
    private final List<Integer> range = new ArrayList<>();

    randomRange(int min, int max) {
        addRange(min, max);
    }

    // adding the range set by the user into an arraylist
    final void addRange(int min, int max) {
        for (int i = min; i <= max; i++) {
            range.add(i);
        }
    }

    // finds the random number withing the range and returns an int.
    int getRandom() {
        return range.get(new Random().nextInt(range.size()));
    }
}