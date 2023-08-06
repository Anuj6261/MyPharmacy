package com.pharmacystore.connection;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
public class DbConnection 
{
  public static Connection getDatabaseConnection() {
 try 
 {
	 Class.forName( DbDetails.DBDRIVER);
	 Connection con = DriverManager.getConnection
(DbDetails.CONNEC,DbDetails.USERNAME,
		DbDetails.PASSWORD);
	 return con;
	 
 }
 catch(SQLException | 
			ClassNotFoundException exc) {
		exc.printStackTrace();
		return null;
	}
 
}
 
}
