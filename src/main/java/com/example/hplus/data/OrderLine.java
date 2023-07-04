package com.example.hplus.data;

import jakarta.persistence.*;

@Entity
@Table(name="ORDER_LINES")
public class OrderLine {
    @Id
    @Column(name="ORDER_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JoinColumn(name="ORDER_ID", nullable = false, updatable = false)
    @ManyToOne
    private Order order;
    @OneToOne
    @JoinColumn(name="PRODUCT_ID", nullable = false, updatable = false)
    private Product product;
    @Column(name="QUANTITY")
    private int quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
