package com.neoteric.jpa.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Account {

    private String name;
    private String accounNumber;
    private String panNumber;
    private String mobileNumber;
    private double balance;
    private Address address;





}
