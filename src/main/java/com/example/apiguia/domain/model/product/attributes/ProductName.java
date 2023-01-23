package com.example.apiguia.domain.model.product.attributes;

public class ProductName {
    private final String value;
    //Builder
    public ProductName(String value) {
        this.value = value;
    }
    //Getter

    public String getValue() {
        return value;
    }
}
