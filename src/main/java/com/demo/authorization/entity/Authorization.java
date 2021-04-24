package com.demo.authorization.entity;

import javax.persistence.*;

@Entity
@Table(name = "AUTHORIZATION")
public class Authorization {

    @Id @GeneratedValue
    @Column(name = "AUTHORIZATION_ID")
    Integer Id;

    @Column(name = "ACCOUNT_ID")
    Integer accountId;

    @Column(name = "PARTY_ID")
    Integer partyId;

    @Column(name="REF_NUMBER")
    Integer paymentReferenceNumber;

    @Column(name = "AMOUNT")
    Integer amount;

    @Column(name = "AUHTORIZATION_TEXT")
    String authorizationText;

    public Authorization() {
    }

    public Authorization(Integer id, Integer accountId, Integer partyId, Integer paymentReferenceNumber, Integer amount, String authorizationText) {
        Id = id;
        this.accountId = accountId;
        this.partyId = partyId;
        this.paymentReferenceNumber = paymentReferenceNumber;
        this.amount = amount;
        this.authorizationText = authorizationText;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public Integer getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getAuthorizationText() {
        return authorizationText;
    }
}
