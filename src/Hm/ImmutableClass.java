package Hm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final String className;
    private final List<Integer> numbers;
    private final CustumMutableClass custum;

    public ImmutableClass(String className, List<Integer> numbers, CustumMutableClass custum) {
        this.className = className;
        this.numbers = new ArrayList<>(List.copyOf(numbers));
        this.custum = new CustumMutableClass(custum.getValue());
    }

    public String getClassName() {

        return className;
    }

    public List<Integer> getNumbers() {

        return numbers;
    }

    public CustumMutableClass getCustum() {

        return custum;
    }

    @Override
    public String toString() {
        return " className = '" + className +
                ", numbers = " + numbers +
                ", custum = " + custum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(className, that.className) && Objects.equals(numbers, that.numbers) && Objects.equals(custum, that.custum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, numbers, custum);
    }
}
