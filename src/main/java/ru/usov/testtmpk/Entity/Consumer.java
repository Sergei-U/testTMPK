package ru.usov.testtmpk.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "Consumers")
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",unique = true, updatable = false, insertable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BALANCE")
    private BigDecimal balance;

    @OneToMany(targetEntity = Contracts.class)
    private List<Contracts> contractsList;

    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    private List<Address> addressList;


    public Consumer(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }
}
