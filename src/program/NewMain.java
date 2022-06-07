/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===== TEST 1: Department Insert =====");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department department = new Department (null, "Music");
        departmentDao.insert(department);
        System.out.println(department);
        
         System.out.println("===== TEST 2: Department update =====");
         department = departmentDao.findById(6);
         department.setName("Computers");
        departmentDao.update(department);
        System.out.println(department);
        
        System.out.println("===== TEST 3: Department Delete =====");
         departmentDao.deleteById(8);
        
        System.out.println("===== TEST 4: Department FindById =====");
        department = departmentDao.findById(2);
        System.out.println(department);
        
        
        
        System.out.println("===== TEST 5: Department Findall =====");
        List<Department> list = departmentDao.findAll();
        System.out.println(list);
        
        
    }
    
}
