package com.deloitte.library.dao;

import java.sql.*;

import com.deloitte.library.model.Books;

public class BooksDAO {
	public static Connection connectToDB() {
Connection connection = null;
		try {
			// STEP - 1 : Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// STEP - 2 Connecting with oracle database
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"admin");
			return connection;
		}

		catch (ClassNotFoundException |SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}



 
public static void addBook(Books book) {
	System.out.println(book);
	
	
	// STEP-3 Create Statement
	try {
		Connection con = connectToDB();
		PreparedStatement stmt = connectToDB().prepareStatement("insert into books values(?,?,?,?)");
		stmt.setInt(1, book.getBookId());
		stmt.setString(2, book.getBookName());
		stmt.setInt(3, book.getPrice());
		stmt.setString(4, book.getAuthor());
		
		// step 4 - execute sql query 

		int affectedRows = stmt.executeUpdate();
		Statement stmt1=con.createStatement();  
		System.out.println("affected rows : " + affectedRows);
		ResultSet rs=stmt1.executeQuery("select * from books");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+ " "+ rs.getString(3));  
		con.close();
			
				
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}