package ru.usov.testtmpk.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 */
@Data
@NoArgsConstructor
public class TariffPaymentSchedule {
    private LocalDate paymentDate;
    private BigDecimal paymentAmount;
    }
