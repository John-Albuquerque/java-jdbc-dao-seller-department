package application;

import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.00, obj );
        System.out.println(seller);


    }
}
