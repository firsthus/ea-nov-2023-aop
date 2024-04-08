package edu.miu.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
public class Product {

    @Id
    private Long id;

    private String name;

    private BigDecimal price;

    private int rating;

    @ManyToOne
    private Category category;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }



    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
