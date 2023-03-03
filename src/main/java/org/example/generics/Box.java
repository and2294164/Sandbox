package org.example.generics;

public class Box<T extends Number> {

    private T value;

    public Box() {
        value = null;
    }

    public Box(T value) {
        this.value = value;
    }

    public T getContents() {
        return value;
    }

    public void setContents(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{value = " + value);
        sb.append('}');
        return sb.toString();
    }

}
