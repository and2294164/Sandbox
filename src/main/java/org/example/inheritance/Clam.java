package org.example.inheritance;

public class Clam extends Mollusca {

    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Clam{I'm a clam!");
        sb.append('}');
        return sb.toString();
    }
}
