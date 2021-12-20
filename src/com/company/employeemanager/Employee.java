package com.company.employeemanager;

public class Employee {
    protected String name;
    public String surname;
    public String idnp;
    public char gender;
    public String function;

    public Employee(String name, String surname, String idnp, char gender, String function) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
        this.gender = gender;
        this.function = function;
    }

}
