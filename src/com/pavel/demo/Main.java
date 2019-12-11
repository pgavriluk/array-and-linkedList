package com.pavel.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    private static Set<String[]> controllersChecklistModal1Set = new LinkedHashSet<>();

    public static void main(String[] args) {

        String str = "100.1.1.1.2.3.4.554";

        String section = str.substring(0,str.indexOf('.', str.indexOf(".")+1));

        String keyPositionInMap = str.substring(str.lastIndexOf(".")+1);

        controllersChecklistModal1Set.add(new String[] {"1.1.1", "Information audit performed", "some"});

        controllersChecklistModal1Set.toArray();



	    Customer customer = new Customer("Pavel", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

        intList.add(1, 2);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

    }
}
