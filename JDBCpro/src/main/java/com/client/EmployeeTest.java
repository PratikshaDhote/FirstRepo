package com.client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.util.JdbcUtility;

public class EmployeeTest {
	public void insertEmployee() throws SQLException
	{
		Employee employee = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		employee.setName(sc.nextLine());
		
		System.out.println("Enter Mobile");
		employee.setMobile(sc.next());
		
		System.out.println("Enter Address");
		employee.setAddress(sc.next());
		
		String sql="insert into employee(name,mobile,address)values('"+employee.getName()+"',"
				+ "'"+employee.getMobile()+"','"+employee.getAddress()+"')";
		Statement stmt=JdbcUtility.getJdbcConnection().createStatement();
		int result =stmt.executeUpdate(sql);
		if (result>0) 
			
			System.out.println("successfully inserted");
		
			else
				System.out.println("failure..try again..!!!");

			stmt.close();
			
		}
	public void selectemployee() throws SQLException
	{
		List<Employee> list=new ArrayList<Employee>();
		 Statement smt=JdbcUtility.getJdbcConnection().createStatement();
		 ResultSet rs=smt.executeQuery("select * from employee");
		 while(rs.next())
		 {
			 Employee emp= new Employee();
			 emp.setId(rs.getInt(1));
			 emp.setName(rs.getString(2));
			 emp.setMobile(rs.getString("mobile"));
			 emp.setAddress(rs.getString(4));
		 }
		 for (Employee employee : list) {
			System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getMobile()+"\t"+employee.getAddress());
		}
	}
	public void deleteEmployee() throws SQLException {

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		employee.setId(sc.nextInt());

		int result = JdbcUtility.getJdbcConnection().createStatement()
				.executeUpdate("delete from employee where id=" + employee.getId() + "");

		if (result > 0)
			System.out.println("recored deleted successfully..");
		else
			System.out.println("Failure try again..!!");

	}
public static void main(String[] args) {
	EmployeeTest t = new EmployeeTest();
	try {
		/* t.insertEmployee();
		t.selectemployee();*/
		t.deleteEmployee();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

}
