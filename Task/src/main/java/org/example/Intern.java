package org.example;

public class Intern extends Employee{
    public static final double SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name,email,age,salary);
        if (salary > SALARY_LIMIT){
            throw new IllegalArgumentException("The salary of an intern does not exceed 20,000");
        }
    }
}
