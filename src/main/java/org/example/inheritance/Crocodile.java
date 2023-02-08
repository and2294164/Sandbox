package org.example.inheritance;

public class Crocodile extends Reptile{

    public Crocodile() {
        this.hasScales = true;
    }

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
        final StringBuffer sb = new StringBuffer("Crocodile{");
        sb.append('}');
        return sb.toString();
    }
}
