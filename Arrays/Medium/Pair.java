package Arrays.Medium;

public class Pair<T, U> {
    public T first;
    public U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Optional: override toString() for easier printing
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
