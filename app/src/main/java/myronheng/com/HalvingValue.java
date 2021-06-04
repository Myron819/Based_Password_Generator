package myronheng.com;

public class HalvingValue {
    private int value;

    public HalvingValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int useHalvingValue() {
        this.value /= 2;
        return value;
    }

}
