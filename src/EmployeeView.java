import java.util.List;
import java.util.Scanner;

public class EmployeeView {
	Scanner sc;

	public EmployeeView(Scanner sc) {
		this.sc = sc;
	}

	public void displayEmployees(List<Employee> employees) {
		if (employees.size() != 0) {
			for (Employee e : employees) {
				System.out.println(e);
			}			
		} else {
			System.out.println("No employees found.");
		}
	}

	public void displayEmployee(Employee employee) {
		if (employee != null)
			System.out.println(employee);
		else
			System.out.println("No employee found.");
	}
	
	public int getEmployeeID() {
		System.out.print("Please provide the employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		return id;
	}

	public int[] getAgeRange() {
		int[] ageRange = new int[2];
		System.out.println("Please provide the age range: ");
		System.out.print("Minimum age: ");
		ageRange[0] = Integer.parseInt(sc.nextLine());
		System.out.print("Maximum age: ");
		ageRange[1] = Integer.parseInt(sc.nextLine());
		return ageRange;
	}

	
}
