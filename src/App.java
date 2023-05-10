import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeView view = new EmployeeView(sc);
		EmployeeDAO dao = new EmployeeDAO();
		
		EmployeeController controller = new EmployeeController(view, dao);
		controller.displayEmployee();
		controller.displayEmployeesFilteredByAge();
	}
	
}
