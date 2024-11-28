package Hm;

public class Box<T> {
    private T type;

    public Box(T type) {
        this.type = type;
    }

    public T get() {
        return type;
    }

    public void set(T type) {
        this.type = type;
    }

    public boolean isEmpty() {
        boolean empty = true;
        if (type != null) {
            empty = false;
        }

        return empty;
    }

    public void clear() {
        type = null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + type +
                '}';
    }
}
