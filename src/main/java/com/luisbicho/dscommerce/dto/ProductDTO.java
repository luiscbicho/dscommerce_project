package com.luisbicho.dscommerce.dto;

import com.luisbicho.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class ProductDTO implements Serializable {

    private Long id;
    @Size(min = 3, max = 80, message = "Name must contain between 3 and 80 characters")
    @NotBlank(message = "Required Field")
    private String name;
    @Size(min = 10, message = "Description must contain at least 10 characters")
    private String description;
    @Positive(message = "Price must be positive")
    private Double price;
    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
