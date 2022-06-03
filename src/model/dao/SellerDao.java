
package model.dao;

import java.util.List;  
import model.entites.Seller;

public interface  SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller Id);
    Seller findById(Integer Id);
    List<Seller> findAll();
    
    
}
