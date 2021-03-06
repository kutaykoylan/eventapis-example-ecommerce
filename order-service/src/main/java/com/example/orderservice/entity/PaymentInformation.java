package com.example.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInformation {

    private float amount; // kargo fiyatı + order.amount

    private String paymentAddress;

    private String cardInformation;

}
