package com.company.solid.isp.model;

public class SqlServeProduct implements IDbProduct {

    public String getProductById(String productID){
        return "SQLSERVE: exibindo dados do produto "+ productID;
    }
}
