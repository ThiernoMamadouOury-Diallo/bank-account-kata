package com.socgen.itec.bank.account.kata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

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
    private String date;
    private String amount;
    private String balance;
}
