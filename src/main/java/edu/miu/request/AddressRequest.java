package edu.miu.request;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddressRequest {

    private String street;

    private String zip;

    private String city;

}