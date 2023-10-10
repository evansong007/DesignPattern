package org.example.creational.prototype;

public class MilkTea implements Cloneable{
    public String type;
    public boolean ice;
    @Override
    protected MilkTea clone() throws CloneNotSupportedException {
        return (MilkTea) super.clone();
    }
}

