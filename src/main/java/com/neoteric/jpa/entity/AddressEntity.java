package com.neoteric.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address",schema ="bank2" )
public class AddressEntity {

    public AddressEntity(){

    }

    @Id
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "housenumber")
    private String houseNumber;

    @Column(name = "area")
    private String area;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;


  //  private String accountNumber;

    @ManyToOne()
    @JoinColumn(name = "accountnumber",referencedColumnName = "accountnumber")
    public AccountEntity accountEntity;








}
