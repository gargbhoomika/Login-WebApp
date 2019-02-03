package gargbhoomika.web.dao;

import gargbhoomika.web.model.TestClass;
import java.sql.*;
public class TestDao 
{
	
	public TestClass getTestData(String name)
	{
		TestClass t = new TestClass();		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Bhoomi13@");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from testtable where name='"+name+"'");
		if(rs.next())
		{
			t.setName(rs.getString("Name"));;
			t.setAge(rs.getInt("Age"));
			t.setSex(rs.getString("Sex"));
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		return t;
	}
}
