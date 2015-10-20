package seleniumdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class functions {
	static void login(WebDriver driver) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//img[1]")).sendKeys(Keys.ESCAPE);
        System.out.println("Escape from pop up");
        
        WebElement userid = driver.findElement(By.name("txtUserName"));
        userid.sendKeys("shivamgupta");
         System.out.println("Username is entered");

        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("$hi@123$");
        System.out.println("Password is entered");
        Thread.sleep(3000);
        
        driver.findElement(By.name("Submit")).click();
        System.out.println("Succesfully login");
	}
	static void checkhomepage(WebDriver driver){
		WebElement element2 =driver.findElement(By.xpath("//a[text()='HR Documents']"));
       (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element2));
	}
	
	static void checkleavepage(WebDriver driver){
		WebElement element3=driver.findElement(By.xpath("//a[text()='Leave']"));
        element3.click();
        System.out.println("Leave tap is clicked");
        WebElement element4=driver.findElement(By.xpath("//a[text()='Apply']"));
        element4.isDisplayed();
	}
	static void checktimepage(WebDriver driver) throws InterruptedException{
		WebElement element5=driver.findElement(By.xpath("//a[text()='Time']"));
        element5.click();
        System.out.println("Time tap is clicked");
        WebElement element6=driver.findElement(By.xpath("//a[text()='My Timesheet']"));
        element6.isDisplayed();
        Thread.sleep(4000);
	}
	static void checkmyprofilepage(WebDriver driver){
		WebElement element7=driver.findElement(By.xpath("//a[text()='My Profile']"));
        element7.click();
        System.out.println("My Profile tab is clicked");
        
        driver.switchTo().frame("rightMenu");
        WebElement element8=driver.findElement(By.id("btnEdit"));
        element8.isDisplayed();
        
        driver.switchTo().defaultContent();
	}
	static void checkmrbspage(WebDriver driver){
		 WebElement element9=driver.findElement(By.xpath("//a[text()='MRBS']"));
	        element9.click();
	        System.out.println("MRBS tap is clicked");
	        WebElement element10=driver.findElement(By.xpath("//a[text()='Rooms']"));
	        element10.isDisplayed();
	}
	static void checkcurrentopeningspage(WebDriver driver){
		 WebElement element11=driver.findElement(By.linkText("Current Openings"));
	        element11.click();
	        System.out.println("Current Openings tab is clicked");
	        WebElement element12=driver.findElement(By.xpath("//a[text()='My Referrals Status']"));
	        element12.isDisplayed();
	}
	static void checkemployelistpage(WebDriver driver) throws InterruptedException{
		WebElement element13=driver.findElement(By.linkText("Employee Checklist"));
        element13.click();
        System.out.println("Employee Checklist tab is clicked");
        WebElement element14=driver.findElement(By.xpath("//a[text()='Checklist Info']"));
        element14.isDisplayed();
        Thread.sleep(2000);
	}
	static void checkglpipage(WebDriver driver) throws InterruptedException{
		WebElement element15=driver.findElement(By.xpath("//a[text()='GLPI']"));
        element15.click();
        System.out.println("GLPI tab is clicked");
        driver.switchTo().frame("rightMenu");
        WebElement element16=driver.findElement(By.id("emp_name"));
        element16.isDisplayed();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
	}
	static void checkonsiteopportunitypage(WebDriver driver) throws InterruptedException{
		 WebElement element17=driver.findElement(By.xpath("//a[text()='Onsite Opportunity']"));
	        element17.click();
	        System.out.println("Onsite Opportunity tab is clicked");
	        WebElement element18=driver.findElement(By.xpath("//a[text()='Opportunities']"));
	        element18.isDisplayed();
	        Thread.sleep(3000);
	}
	static void logout(WebDriver driver){
		WebElement logoutbtn=driver.findElement(By.linkText("Logout"));
        logoutbtn.click();
        System.out.println("Succesfully Logout!");
	}


}
