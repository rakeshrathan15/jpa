package com.neoteric.jpa.service;

import com.neoteric.jpa.entity.AccountEntity;
import com.neoteric.jpa.entity.AddressEntity;
import com.neoteric.jpa.model.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Objects;

public class AccountService {

//
//    public Account searchAccountByJPA(String accountNumber){
//
//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpaDemo");
//        EntityManager entityManager=emf.createEntityManager();
//        entityManager.getTransaction().begin();
//        jakarta.persistence.Query query=entityManager.createQuery("Select a from AccountEntity a where a.accountNumber=:inputAccountNumber");
//        query.setParameter("inputAccountNumber",accountNumber);
//
//        List<AccountEntity> accountEntities=query.getResultList();
//        AccountEntity accountEntity=accountEntities.get(0);
//
//        Account account= Account.builder()
//                .accounNumber(accountEntity.getAccountNumber())
//                .mobileNumber(accountEntity.getMobileNumber())
//                .balance(accountEntity.getBalance())
//                .pan(accountEntity.getPan()).build();
//
//
//
//        List<AddressEntity> accountAddressEntityList=
//                accountEntity.getAccountAddressEntityList();
//
//        if (Objects.nonNull(accountAddressEntityList) && accountAddressEntityList.size()>0){
//            AddressEntity accountAddressEntity=accountAddressEntityList.get(0);
//            Address address= new Address();
//            address.setAdd1(accountAddressEntity.getAddress1());
//            address.setAdd2(accountAddressEntity.getAddress2());
//            address.setCity(accountAddressEntity.getCity());
//            address.setPincode(accountAddressEntity.getPincode());
//            address.setState(accountAddressEntity.getState());
//            account.setAddress(address);
//        }
//        entityManager.getTransaction().commit();
//        return account;
//
//    }



    public Account





}
