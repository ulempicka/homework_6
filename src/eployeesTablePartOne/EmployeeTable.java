package eployeesTablePartOne;

public class EmployeeTable {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();

        employees[0].setEmployee();
        employees[0].showEmployee(employees[0]);

        employees[1].setEmployee();
        employees[1].showEmployee(employees[1]);

        employees[2].setEmployee();
        employees[2].showEmployee(employees[2]);

        int sumSalary = employees[0].getSalary() + employees[1].getSalary() + employees[2].getSalary();
        System.out.println("Wydatki firmy na wypłaty: " + sumSalary);
    }
}
