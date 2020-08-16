package com.softwaretesting;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterXML {
	Connection conn;
	
	@Test
	@Parameters({"dbconfig", "poolsize"})
	public void createConection(String dbconfig, int poolsize) {
		System.out.println("dbconfig: " + dbconfig);
		System.out.println("poolsize: " + poolsize);
		
		Properties pro = new Properties();
		InputStream input = null;
		
		try {
			String path = System.getProperty("user.dir") + "\\" + dbconfig;
			
			System.out.println("path => " + path);
			
			pro.load(new FileInputStream(dbconfig));
			String drivers = pro.getProperty("jdbc.driver");
			String connectionURL = pro.getProperty("jdbc.url");
			String username = pro.getProperty("jdbc.username");
			String password = pro.getProperty("jdbc.password");
			
			System.out.println("drivers: " + drivers);
			System.out.println("connectionURL: " + connectionURL);
			System.out.println("username: " + username);
			System.out.println("password: " + password);
			
			Class.forName(drivers);
			conn = DriverManager.getConnection(connectionURL, username, password);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
