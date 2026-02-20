package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Elvin Məmmədov", "elvin.mammadov@mail.az", 25, 9000),
                new Employee("Nərmin Əliyeva", "narmin.aliyeva@mail.az", 23, 8050),
                new Employee("Orxan Həsənov", "orxan.hasanov@mail.az", 28, 11000),
                new Employee("Aysel Quliyeva", "aysel.quliyeva@mail.az", 24, 8000),
                new Intern("Murad Əliyev", "murad@mail.com", 20, 9000),
                new Intern("Leyla Rəhimova", "leyla@mail.com", 21, 12000),
                new Employee("Rəşad İsmayılov", "rashad.ismayilov@mail.az", 31, 23000),
                new Employee("Kamal Hüseynov", "kamal.huseynov@mail.az", 35, 15000),
                new Employee("Zəhra Abdullayeva", "zahra.abdullayeva@mail.az", 22, 700),
                new Employee("Günel Sadiqova", "gunel.sadiqova@mail.az", 26, 99950)
        };
        try(FileWriter writer = new FileWriter("employees.txt")){
            for(Employee employee : employees){
                writer.write("Name: " + employee.getName()+ "\n");
                writer.write("Email: " + employee.getEmail()+ "\n");
                writer.write("Age: " + employee.getAge()+ "\n");
                writer.write("Salary: " + employee.getSalary() +"\n");
                writer.write("-------------------\n");
            }
            System.out.println("employees.txt created successfully!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}