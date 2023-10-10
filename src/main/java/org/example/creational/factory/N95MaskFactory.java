package org.example.creational.factory;

public class N95MaskFactory {
    public Mask create() {
        return new N95Mask();
    }
}
