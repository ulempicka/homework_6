package eployeesTablePartOne;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    Scanner scanner = new Scanner(System.in);

    public void setFirstName() {
        System.out.println("Podaj imię pracownika");
        firstName = scanner.nextLine();
    }

    public void setLastName() {
        System.out.println("Podaj nazwisko pracownika");
        lastName = scanner.nextLine();
    }

    public void setSalary() {
        System.out.println("Podaj wysokość wynagrodzenia");
        salary = scanner.nextInt();
    }

    public void setEmployee(){
        setFirstName();
        setLastName();
        setSalary();
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    void showEmployee(Employee employee){
        System.out.println(employee.toString());
    }
}
