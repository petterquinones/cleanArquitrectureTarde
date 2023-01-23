package com.example.apiguia.domain.model.product.attributes;

public class ProductPrice {
    private final String value;

    //Builder

    public ProductPrice(String value) {
        this.value = value;
    }
    //Getter

    public String getValue() {
        return value;
    }
}
