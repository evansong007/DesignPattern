package org.example.creational.factory;

public class MaskFactory {
    public Mask create(String type){
        // TODO: 使用简单工厂模式实现此处的逻辑
        switch (type){
            case "Surgical":
                return new SurgicalMask();
            case "N95":
                return new N95Mask();
            default:
                throw new IllegalArgumentException("Unsupported mask type");
        }

    }
}

