package com.company.solid.isp.factory;

import com.company.solid.isp.model.*;

public class DbFactoryProduct {

    public static IDbProduct create(Db type){
        if (type == Db.MYSQL){
        return new MySQLProduct();
        } else if(type == Db.MONGODB){
            return new MongoDbProduct();
        } else{
            return new SqlServeProduct();
        }
    }
}
