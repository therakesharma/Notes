public class EmployeeTest {

	public static void main(String[] args) {
		var employees = new Employee[3];
	
		employees[0] = new Employee("Rakesh", 100000000, 2021, 06, 21);
		employees[1] = new Employee("Rahul", 100000000, 2021, 02, 1);
		employees[2] = new Employee("Amrita", 100000000, 2025, 06, 8);
	
		for (var employee : employees) {
			System.out.println("Name : " + employee.getName() + " Salary : " + employee.getSalary());
		}
	
		for (var employee : employees) {
			employee.giveHike();
		}
	
		for (var employee : employees) {
			System.out.println("Name : " + employee.getName() + " Salary : " + employee.getSalary());
		}
	}
	
}