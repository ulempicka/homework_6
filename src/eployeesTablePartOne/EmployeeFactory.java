package eployeesTablePartOne;

import java.util.Scanner;

public class EmployeeFactory {

    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię pracownika");
        String firstName = scanner.nextLine();


        System.out.println("Podaj nazwisko pracownika");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wysokość wynagrodzenia");
        int salary = scanner.nextInt();

        return new Employee(firstName, lastName, salary);
    }
}
