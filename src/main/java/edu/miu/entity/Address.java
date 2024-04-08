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
public class Address {

    @Id
    private Long id;

    @OneToOne
    private User owner;

    private String street;

    private String zip;

    private String city;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address user = (Address) o;
        return Objects.equals(owner, user.owner);
    }



    @Override
    public int hashCode() {
        return owner != null ? owner.hashCode() : 0;
    }
}
