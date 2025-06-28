package _4OOP_Part1.constructorChallenge;

public class Main {
    
    public static void main(String[] args) {
        
        Customer customer = new Customer("Tim", 1000, "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();// if you try to define this secondCustomer 'instance or object' without defining a constructor with no arguments in the Customer.java file will cause an error bcoz u need to define a constructor over there first in order to use this 'instance or object' here. 
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}
