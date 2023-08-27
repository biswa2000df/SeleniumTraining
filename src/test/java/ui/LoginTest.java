package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	/*@BeforeTest
	public void LoginToApplication()
	{
		System.out.println("Login to application");
	}
	
	
	@AfterTest
	public void LogoutFromApplication()
	{
		System.out.println("Logout From application");
	}
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB connected");
	}
	@AfterMethod
	public void disconnectFromDB()
	{
		
		System.out.println("DB disconnected");
	}*/
	
	
	@Test//(priority=1,description="This is the login test")
	public void  bloginTest()
	{
		
		System.out.println("Login is successfully");
	}
//	@Test//(priority=0,description="This is the login test")
	/*public void  alogoutTest()
	{
		
		System.out.println("Logout is successfully");
	}*/
	
}  
