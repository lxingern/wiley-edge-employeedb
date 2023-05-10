import java.sql.SQLException;
import java.util.List;

public class EmployeeController {
	
	EmployeeView view;
	EmployeeDAO dao;
	
	public EmployeeController(EmployeeView view, EmployeeDAO dao) {
		this.view = view;
		this.dao = dao;
	}

	public void displayEmployee() {
		int empId = view.getEmployeeID();
		Employee employee = null;
		try {
			employee = dao.getEmployeeById(empId);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Database connection error.");
		}
		view.displayEmployee(employee);
	}
	
	public void displayEmployeesFilteredByAge() {
		int[] ageRange = view.getAgeRange();
		List<Employee> filteredEmployees = null;
		try {
			filteredEmployees = dao.getEmployeesFilteredByAge(ageRange);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Database connection error.");
		}
		view.displayEmployees(filteredEmployees);
	}
}
