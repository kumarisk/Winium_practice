package com.winium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_test {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void test() throws MalformedURLException, InterruptedException {
	
	DesktopOptions option = new DesktopOptions();
	
	option.setApplicationPath("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Winium_practice\\Test_Application\\calc.exe");
	Thread.sleep(7000);
	WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
	
	Thread.sleep(7000);
	
	}
	
	@Test
	public void Sevenbtn() {
		driver.findElement(By.id("137")).click();
				
	}
	
//	@Test(priority=2)
//	public void plusbtn() {
//		driver.findElement(By.name("Plus")).click();
//	}
//	
//	@Test(priority=3)
//	public void Ninebtn() {
//		driver.findElement(By.name("Nine")).click();
//	}
//	
//	@Test(priority=4)
//	public void equalsbtn() {
//		driver.findElement(By.name("Equals")).click();
//		String output= driver.findElement(By.name("Display is 0")).getAttribute("Name");
//		System.out.println(output);
//	}
	

	
	
//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}
}
