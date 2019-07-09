package com.socgen.itec.bank.account.kata.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@Builder
public class Operations {
    private static final long serialVersionUID = 1L;

    private List<Operation> operations;
}
