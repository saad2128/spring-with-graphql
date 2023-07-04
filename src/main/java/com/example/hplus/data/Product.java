package com.example.hplus.data;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="PRODUCTS")
public class Product {

    @Id
    @Column(name="PRODUCT_ID")
    private String id;
    @Column(name="NAME")
    private String name;
    @Column(name="SIZE")
    private int size;
    @Column(name="VARIETY")
    private String variety;
    @Column(name="PRICE")
    private BigDecimal price;
    @Column(name="STATUS")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}