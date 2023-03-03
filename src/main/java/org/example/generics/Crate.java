package org.example.generics;

import java.util.*;

public class Crate <T extends Box<?>> {

    protected List<T> containers;

    public Crate() {
        this.containers = new ArrayList<>();
    }

    public void addBox(T box) {
        this.containers.add(box);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Crate{");
        sb.append("crate contents=").append(containers);
        sb.append('}');
        return sb.toString();
    }
}
