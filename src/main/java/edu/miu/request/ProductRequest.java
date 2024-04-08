package edu.miu.request;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class ProductRequest {

    private String name;

    private BigDecimal price;

    private int rating;

    private Long categoryId;

}
