package com.company.employeemanager;
import java.util.Scanner;

public class EmployeeManager implements Manageable {
    private Employee[] employees = new Employee[100];
    private int employeesNumber=0;
    private Scanner input = new Scanner(System.in);

    public void add() {
        System.out.print("\nNume:");
        String name = input.nextLine();
        System.out.print("\nPrenume:");
        String surname = input.nextLine();
        System.out.print("\nIdnp:");
        String idnp = input.nextLine();
        System.out.print("\nGender:");
        char gender = input.next().charAt(0);
        System.out.print("\nFunction:");
        String function = input.nextLine();

        employees[employeesNumber] = new Employee(name, surname, idnp, gender, function);

        employeesNumber++;
    }

    public void edit() {
        System.out.println("edit");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void read() {
        System.out.print("Nr angajatului:");
        int nr = input.nextInt();

        System.out.println(employees[nr]);
    }
}
