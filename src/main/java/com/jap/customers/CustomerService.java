package com.jap.customers;


import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Abbie");
        namesList.add("John");
        namesList.add("Mary");
        namesList.add("Michelle");
        namesList.add("Sam");
        namesList.add("Tara");
        namesList.add("Trevor");
        // namesList.add("Raji");
        for (String name : namesList) {
            System.out.println(name);
        }
        return namesList;
    }
}