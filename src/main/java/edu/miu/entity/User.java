package edu.miu.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
public class User {

    @Id
    private Long id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne(mappedBy = "owner")
    private Address address;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }



    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
