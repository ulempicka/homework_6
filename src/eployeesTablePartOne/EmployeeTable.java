package eployeesTablePartOne;

public class EmployeeTable {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        EmployeeFactory factory = new EmployeeFactory();
        employees[0] = factory.createEmployee();
        employees[1] = factory.createEmployee();
        employees[2] = factory.createEmployee();

        employees[0].showEmployee(employees[0]);
        employees[1].showEmployee(employees[1]);
        employees[2].showEmployee(employees[2]);

        EmployeeUtils utils = new EmployeeUtils();
        int sumSalary = utils.sumSalary(employees);
        System.out.println("Wydatki firmy na wypłaty: " + sumSalary);
    }
}
