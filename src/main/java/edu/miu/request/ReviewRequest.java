package edu.miu.request;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewRequest {

    private String comment;

    private Long productId;
}
