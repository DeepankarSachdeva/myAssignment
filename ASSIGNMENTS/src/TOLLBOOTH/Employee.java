package TOLLBOOTH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {


		Connection con;
	    PreparedStatement stmt;
	    Statement st;
	    ResultSet res;
	   
	    public Connection getConnection() throws Exception
	    {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","5123");
	    	return con;
	    }
	    
	    public void insertEmployee(String Fullname, String city, String contact)
	    {
	    	int rest=0;
	    	System.out.println("****** Insert new Employees*******");
	    	try
	    	{
	    		con=getConnection();
	    		stmt=con.prepareStatement("INSERT INTO deepankar (Fullname, City, Contact) VALUES (?,?,?)");
	    		stmt.setString(1, Fullname);
	    		stmt.setString(2, city);
	    		stmt.setString(3, contact);
	    		rest=stmt.executeUpdate();
	    		if(rest==1)
	    		{
	    			System.out.println("Employee Save Succesfull");
	    		}
	    		else
	    		{
	    			System.err.println("Input are invalid");
	    		}
	    		con.close();
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    }
	    
	    public void getEmployee()
	    {
	    	System.out.println("****** Display Employees*******");
	    	System.out.println("EmpID****Name****City****Ph.NO");
	    	try
	    	{
	    		con=getConnection();
	        	stmt=con.prepareStatement("select * from deepankar");
	        	res=stmt.executeQuery();
	        	while(res.next())
	        	{
	        		System.out.println(res.getInt("EMPID")+"\t"+res.getString("Fullname")+"\t"+res.getString("CITY")+"\t"+res.getString("CONTACT"));
	        	}
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	
	    }
		
	    public void updateEmployee(int empid,String city)
	    {
	    	int rest=0;
	    	System.out.println("****** Update Employees*******");
	        try
	        {
	        	con=getConnection();
	        	stmt=con.prepareStatement("UPDATE deepankar SET city=? WHERE empid=?");
	        	stmt.setString(1, city);
	        	stmt.setInt(2, empid);
	        	rest=stmt.executeUpdate();
	        	if(rest==1)
	        	{
	        		System.out.println("Employee city Updated");
	        	}
	        	else
	        	{
	        		System.err.println("Employee id is incorrect");
	        	}
	        	con.close();
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	    }
	    
	    public void deleteEmployee(int cid)
	    {
	    	boolean rest=false;
	    	System.out.println("****** Delete Employees*******");
	        try
	        {
	            con=getConnection();
	            stmt=con.prepareStatement("DELETE FROM deepankar WHERE empid=?");
	            stmt.setInt(1, cid);
	            rest=stmt.execute();
	            if(rest==false)
	            {
	            	System.out.println("Employee deleted successfull");
	            }
	            else
	            {
	            	System.err.println("Id is incorrect");
	            }
	            con.close();
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	    }
	    

}



