package com.bfs.springmvc.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Account {
    private int accountNumber;
    private String accountName;
    private Boolean isActive;

}
