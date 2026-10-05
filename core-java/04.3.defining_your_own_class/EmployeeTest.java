import java.time.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
	
		employees[0] = new Employee("Rakesh", 100000000, 2021, 06, 21);
		employees[1] = new Employee("Rahul", 100000000, 2021, 02, 1);
		employees[2] = new Employee("Amrita", 100000000, 2025, 06, 8);
	
		for (Employee employee : employees) {
			System.out.println("Name : " + employee.getName() + " Salary : " + employee.getSalary());
		}
	
		for (Employee employee : employees) {
			employee.giveHike();
		}
	
		for (Employee employee : employees) {
			System.out.println("Name : " + employee.getName() + " Salary : " + employee.getSalary());
		}
	}
	
}


class Employee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDate = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public LocalDate getHireDate() {
		return this.hireDate;
	}
	
	public void giveHike() {
		this.salary = this.salary + (this.salary * 5 / 100);
	}
}

