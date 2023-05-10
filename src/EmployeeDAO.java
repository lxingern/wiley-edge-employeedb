import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {

	public Employee getEmployeeById(int empId) throws SQLException {
		Connection con = WileyConnection.getConnection();
		PreparedStatement pst;
		ResultSet rs;
		Employee employee = null;
		
		try {
			pst = con.prepareStatement("SELECT * FROM employee WHERE id = ?");
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			
			if (rs.next())
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		con.close();
		return employee;
	}

	public List<Employee> getEmployeesFilteredByAge(int[] ageRange) throws SQLException {
		Connection con = WileyConnection.getConnection();
		PreparedStatement pst;
		ResultSet rs;
		Employee employee = null;
		List<Employee> filteredEmployees = new ArrayList<>();
		
		try {
			pst = con.prepareStatement("SELECT * FROM employee WHERE age BETWEEN ? AND ?");
			pst.setInt(1, ageRange[0]);
			pst.setInt(2, ageRange[1]);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
				filteredEmployees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		con.close();
		return filteredEmployees;
	}

}
