package com.company.employeemanager;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
	    // 1. Afisarea meniului principal
        // 2. Utilizatorul selecteaza optiunea
        // 3. Aplicatia realizeaza instructiunea
        // 4. Afisarea meniului principal

        int menuSelect;
        System.out.print("\n\tMENIU");
        System.out.println("\n1.Adauga\n2.Editeza\n3.Sterge\n4.Afiseaza");
        System.out.print("\nSelecteza: ");

        menuSelect = new Scanner(System.in).nextInt();

        EmployeeManager manager = new EmployeeManager();
        switch (menuSelect) {
            case 1: manager.add(); break;
            case 2: manager.edit(); break;
            case 3: manager.delete(); break;
            case 4: manager.read(); break;
        }

    }
}
