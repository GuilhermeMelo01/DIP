package com.company.solid.isp.payment;

import com.company.solid.isp.factory.DbFactoryProduct;
import com.company.solid.isp.model.Db;
import com.company.solid.isp.model.IDbProduct;


public class Payment {
    public void pay(String productID){
        IDbProduct product = DbFactoryProduct.create(Db.SQLSERVE);
        String productById = product.getProductById(productID);
        System.out.println(productById);
    }
}
