import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	private static Connection connection = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	
	public StudentDAO() {
	}
	
	public List<Student> list() throws Exception {
		List<Student> students = new ArrayList<Student>();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Students?user=root&password=root");
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery("select * from Students.users");
			
			while (resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getInt(1));
				student.setFirstName(resultSet.getString(2));
				student.setLastName(resultSet.getString(3));
				student.setEmail(resultSet.getString(4));
				student.setMajor(resultSet.getString(5));
				students.add(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}

}
