package com.socgen.itec.bank.account.kata.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@Builder
public class UserBalance {
    private static final long serialVersionUID = 1L;

    private String userId;
    private BigDecimal balance;
}
