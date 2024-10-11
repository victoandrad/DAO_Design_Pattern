package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        Seller seller = new Seller(1, "Victor Andrade", "victor@gmail.com", new Date(), 10000.0, department);

        System.out.println(seller);

    }
}
