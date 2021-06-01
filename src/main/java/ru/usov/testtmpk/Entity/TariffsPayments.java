package ru.usov.testtmpk.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 *
 */
@Data
@Entity
@Table(name = "TARIFFS_PAYMENTS")
@NoArgsConstructor
public class TariffsPayments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, unique = true, insertable = false)
    private Long id;


}
