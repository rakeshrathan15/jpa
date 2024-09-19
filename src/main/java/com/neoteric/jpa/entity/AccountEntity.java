package com.neoteric.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "account",schema = "bank2")
public class AccountEntity {

  public AccountEntity(){

  }



  @Id
  @Column(name = "accountnumber",nullable = false)
  private String accountnumber;

  @Column(name = "name",nullable = false)
  private String name;

  @Column(name = "pannumber",nullable = false)
  private String pannumber;

  @Column(name = "mobilenumber",nullable = false)
  private String mobilenumber;

  @Column(name = "balance" ,nullable = false)
  private double balance;


  @OneToMany(mappedBy = "accountEntity",cascade =CascadeType.PERSIST,fetch = FetchType.EAGER)
   public List<AddressEntity>  addressEntityList;



}
