package program;

import java.util.Date;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;



public class Program {

    public static void main(String[] args) {
        
        System.out.println("===== TEST 1: seller findById =====");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
        
         System.out.println("\n===== TEST 2: seller findByDepartment =====");
         Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);list.get(1);
        
        for(Seller obj: list){
        System.out.println(obj);
        }
    }

}
