package Hm;

public class CustumMutableClass {
    private Integer value;

    public CustumMutableClass(int value) {
        this.value = value;
    }

    public CustumMutableClass() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " MutableClass value = " + value;
    }
}
