package pages.TerkwazTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tasktest_one {
	Taskpage_one search=new Taskpage_one();
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		search.setupdriver();
			
	}
	

	@Test (priority=0)
	public void searcht(){
		search.searching();
		
	}
	
	@Test (priority=1)
	public void UploadImg(){
		search.upload();
		
	}
	
	@Test (priority=2)
	public void dynamic(){
		search.dynamic_loading();
		
	}

	
}
