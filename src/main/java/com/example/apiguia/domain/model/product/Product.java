package com.example.apiguia.domain.model.product;

import com.example.apiguia.domain.model.product.attributes.*;

public class Product {
    private final ProductId id;
    private final ProductName name;
    private final ProductPrice price;
    private final ProductColor color;
    private final ProductBrand brand;
    //Builder with all arguments
    public Product(ProductId id, ProductName name, ProductPrice price, ProductColor color, ProductBrand brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.brand = brand;
    }
    //Getter
    public ProductId getId() {
        return id;
    }

    public ProductName getName() {
        return name;
    }

    public ProductPrice getPrice() {
        return price;
    }

    public ProductColor getColor() {
        return color;
    }

    public ProductBrand getBrand() {
        return brand;
    }
}
