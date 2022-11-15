package model_dao;

import db.DB;
import model_dao_imple.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }   
    
}
