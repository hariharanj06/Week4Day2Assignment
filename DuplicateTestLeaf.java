package week4.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateTestLeaf {
public static void main(String[] args) {
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hH");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("haran");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Haran");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Private Sector");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	
	WebElement hh = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select State = new Select(hh);
	State.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JP");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ari");
	driver.findElement(By.className("smallSubmit")).click();
	
	String Title = driver.getTitle();
	System.out.println(Title);
	
	if(title.equals(Title)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not equal");
	}
}
}
