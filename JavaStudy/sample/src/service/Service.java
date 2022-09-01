package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Employee;

public class Service {

	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/cmind_db";
	private static final String USER ="root";
	private static final String PASSWORD ="root";

	public Employee findEmployee(String name) {

		Employee employee = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet res = null;

		String sql = "SELECT * FROM employee WHERE name = ?";

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			res = stmt.executeQuery();


			while(res.next()) {
				employee = new Employee(
				res.getInt(1),
				res.getString(2),
				res.getString(3));
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		finally {
			try {
				res.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}


		return employee;

	}

}
