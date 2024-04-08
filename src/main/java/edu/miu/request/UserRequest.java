package edu.miu.request;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class UserRequest {

    private Long id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private AddressRequest addressRequest;

}
