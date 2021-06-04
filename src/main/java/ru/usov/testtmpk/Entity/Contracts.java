package ru.usov.testtmpk.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "CONTRACTS")
public class Contracts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, updatable = false, insertable = false)
    private Long id;

    @OneToOne(targetEntity = Tariffs.class)
    private Tariffs tariffs;


    @OneToMany(targetEntity = TariffsPayments.class)
    private List<TariffsPayments> tariffsPaymentsList;

    public Contracts(Tariffs tariffs) {
        this.tariffs = tariffs;
    }
}
