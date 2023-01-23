package com.example.apiguia.domain.model.product.attributes;

public class ProductBrand {
    private final String value;
    //Builder

    public ProductBrand(String value) {
        this.value = value;
    }

    //Getter

    public String getValue() {
        return value;
    }
}
