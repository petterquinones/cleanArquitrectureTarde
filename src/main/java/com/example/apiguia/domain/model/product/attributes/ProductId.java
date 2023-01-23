package com.example.apiguia.domain.model.product.attributes;

public class ProductId {
    private final Integer value;
    //Builder
    public ProductId(Integer value) {
        this.value = value;
    }
    //Getter
    public Integer getValue() {
        return value;
    }
}
