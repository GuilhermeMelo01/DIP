package com.company.solid.isp.model;

public class MongoDbProduct implements IDbProduct {

    public String getProductById(String productID){
        return "MongoDb: exibindo dados do produto "+ productID;
    }
}
