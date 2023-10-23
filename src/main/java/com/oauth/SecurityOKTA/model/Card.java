package com.oauth.SecurityOKTA.model;

import javax.persistence.*;


@Entity
@Table(name = "card")
public class Card {
    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int cardId;
    @Column(name = "card_no")
    Long cardNo;
    @Column(name = "customer_name")
    String customerName;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
