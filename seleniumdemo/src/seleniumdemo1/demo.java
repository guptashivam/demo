package seleniumdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo {
		 
	    WebDriver drive = new FirefoxDriver();
	    @Test(priority = 1)
	    void window(){
	    	drive.manage().window().maximize();
	        drive.get("http://hris.qait.com/qaithris/login.php");	
	    }
        
        @Test(priority = 2)
       public void logi() throws InterruptedException{
        	functions.login(drive);	
        }
        @Test(priority = 3)
        void homepage(){
        	functions.checkhomepage(drive);	
        }
        @Test(priority = 4)
        void leave(){
        	functions.checkleavepage(drive);	
        }
        @Test(priority = 5)
        void test() throws InterruptedException{
        	functions.checktimepage(drive);	
        }
        @Test(priority = 6)
        void profile(){
        	functions.checkmyprofilepage(drive);	
        }
        @Test(priority = 7)
        void mrbs(){
        	functions.checkmrbspage(drive);	
        }
        @Test(priority = 8)
        void openings(){
        	functions.checkcurrentopeningspage(drive);	
        }
        @Test(priority = 9)
        void employee() throws InterruptedException{
        	functions.checkemployelistpage(drive);	
        }
        @Test(priority = 10)
        void glpi() throws InterruptedException{
        	functions.checkglpipage(drive);	
        }
        @Test(priority = 11)
        void opportunity() throws InterruptedException{
        	functions.checkonsiteopportunitypage(drive);	
        }
        @Test(priority = 12)
        void logo(){
        	functions.logout(drive);	
        }
  }

