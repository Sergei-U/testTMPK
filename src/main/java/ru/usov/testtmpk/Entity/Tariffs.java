package ru.usov.testtmpk.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "TARIFFS")
public class Tariffs {

    @Id
    @Column(name = "ID", unique = true,updatable = false,insertable = false)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "FINISH_DATE")
    private Date finishDate;
    @Column(name = "PAYMENT")
    private int payment;
    @Column(name = "DESCRIPTION")
    private String description;

}
