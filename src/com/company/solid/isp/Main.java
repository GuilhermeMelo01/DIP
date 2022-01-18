package com.company.solid.isp;

import com.company.solid.isp.payment.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
