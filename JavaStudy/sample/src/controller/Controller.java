package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import service.Service;

public class Controller extends HttpServlet {



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		String name = req.getParameter("name");

		System.out.println(name);

		Service service = new Service();
		Employee employee = service.findEmployee(name);

		System.out.println("id:" + employee.getId());

		req.setAttribute("employee", employee);



	}
}
