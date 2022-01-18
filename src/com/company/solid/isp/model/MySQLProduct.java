package com.company.solid.isp.model;

public class MySQLProduct implements IDbProduct{

    public String getProductById(String productID){
        return "Mysql: exibindo dados do produto "+ productID;
    }
}
