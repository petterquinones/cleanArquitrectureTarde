package com.example.apiguia.domain.model.product.attributes;

public class ProductColor {
    private final String value;

    //Builder

    public ProductColor(String value) {
        this.value = value;
    }

    //Getter

    public String getValue() {
        return value;
    }
}
