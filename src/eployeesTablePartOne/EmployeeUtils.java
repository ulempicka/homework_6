package eployeesTablePartOne;

public class EmployeeUtils {
    public int sumSalary(Employee[] employees){
        return (employees[0].getSalary() + employees[1].getSalary() + employees[2].getSalary());
    }
}
