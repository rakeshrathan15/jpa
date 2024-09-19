package com.neoteric.jpa.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {

    private String houseNumber;
    private String area;
    private String city;
    private String state;
    private String pincode;


}
