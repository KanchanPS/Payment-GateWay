package com.razarpay.payload;

import lombok.Data;



    @Data
    public class OrderDetails {
        int amount;
        String currency;
        String noteSubject;
        String noteContent;


    }

