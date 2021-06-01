package ru.usov.testtmpk.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 *
 */
@Data
@Table(name = "ADDRESSES")
@Entity
@NoArgsConstructor
public class Address {

    @Id
    @Column(name = "ID", unique = true, updatable = false,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSE_NUMBER")
    private int houseNumber;

    @Column(name = "APARTMENT_NUMBER")
    private int apartmentNumber;

    public Address(String city, String street, int houseNumber, int apartmentNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }
}
