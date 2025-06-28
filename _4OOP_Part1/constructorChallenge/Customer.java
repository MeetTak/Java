package _4OOP_Part1.constructorChallenge;

public class Customer {
    
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Nobody", "nobody@nowhere.com");// we could have set the creditLimit pararmeter over here but we won't do that bcoz if we do that then we need to change the value of the parameter at two places which is not a good practice(i.e. the value of creditLimit in the second constructor). 
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    } 

    public Customer(String name, double creditLimit, String email) { // we need to use a special qualifier when our
                                                                     // field names are same as the parameter names
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    

    
} 
