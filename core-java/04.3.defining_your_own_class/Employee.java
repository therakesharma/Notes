import java.time.*;

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
