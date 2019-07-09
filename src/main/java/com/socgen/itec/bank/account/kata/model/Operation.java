package com.socgen.itec.bank.account.kata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@Builder
public class Operation {
    private static final long serialVersionUID = 1L;

    private String operation;
    private Date date;
    private BigDecimal amount;
    private BigDecimal balance;
}
