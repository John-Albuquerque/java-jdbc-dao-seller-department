package application;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {


        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("\n=== TEST 1: Department findAll ====");
        List list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 2: Department findById ====");
        Department dep = departmentDao.findById(4);
        System.out.println(dep);

    }
}
