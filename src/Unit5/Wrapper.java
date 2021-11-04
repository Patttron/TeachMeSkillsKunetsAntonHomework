package Unit5;

public class Wrapper {
    final private String value;

    public Wrapper(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }

    @Override
    public String toString() {
        return value;
    }
}
