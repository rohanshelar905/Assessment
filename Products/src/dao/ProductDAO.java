package dao;

import java.sql.*;

import bean.Product;

public class ProductDAO {
	Connection con;
	PreparedStatement ps;
	CallableStatement cs;
	ResultSet rs;
	
	public ProductDAO()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connection Cuccessful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public int addProduct(Product p)
	{
		int ra=0;
		try{
		ps=con.prepareStatement("insert into product values(?,?,?,?)");
		ps.setInt(1,p.getId());
		ps.setString(2,p.getName());
		ps.setInt(3, p.getId());
		ps.setString(4,p.getCategory());
		ra=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	
	
	public ResultSet viewProduct(int id)
	{
		try
		{
			ps=con.prepareStatement("select * from products where id=?");
			ps.setInt(1,id);
			rs=ps.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet viewAllProduct()
	{
		try
		{
			ps=con.prepareStatement("select * from products");
			rs=ps.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
}