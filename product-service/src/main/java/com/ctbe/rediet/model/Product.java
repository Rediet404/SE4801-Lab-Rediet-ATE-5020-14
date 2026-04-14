package com.ctbe.rediet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
@Entity
@Table(name = "products")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotBlank(message = "Name is required")
@Column(nullable = false)
private String name;
@DecimalMin(value = "0.01", message = "Price must be greater than 0")
@Column(nullable = false)
private double price;
@Min(value = 0, message = "Stock quantity cannot be negative")
private int stockQty;
@NotBlank(message = "Category is required")
private String category;
// ── Constructors ──────────────────────────────────────────
public Product() {}
public Product(String name, double price, int stockQty, String category) {
this.name = name;
this.price = price;
this.stockQty = stockQty;
this.category = category;
}
// ── Getters & Setters (omit Lombok for clarity) ───────────
public Long getId() { return id; }
public String getName() { return name; }
public double getPrice() { return price; }
public int getStockQty() { return stockQty; }
public String getCategory() { return category; }
public void setId(Long id) { this.id = id; }
public void setName(String n) { this.name = n; }

public void setPrice(double p) { this.price = p; }
public void setStockQty(int q) { this.stockQty = q; }
public void setCategory(String c){ this.category = c; }
}