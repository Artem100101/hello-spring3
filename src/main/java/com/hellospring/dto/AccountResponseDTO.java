package com.hellospring.dto;

import com.hellospring.entity.Account;

public class AccountResponseDTO {
    private Long accountID;

    private String name;

    private String email;

    private Integer bill;

    public AccountResponseDTO(Long accountID, String name, String email, Integer bill) {
        this.accountID = accountID;
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountResponseDTO(Account account){
        accountID = account.getId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }
}
