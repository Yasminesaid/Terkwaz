package pages.TerkwazTask;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import com.google.inject.Key;

public class Taskpage_one {
	WebDriver driver;
	
	//setup chrome driver 
	public void setupdriver(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
				"\\webdriver\\chromedriver.exe" );
	  driver=new ChromeDriver();	
//	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/ncr");
	}
	
	// search for string and loop through links and make comparison
	public void searching(){
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium webdriver");
		element.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
//		driver.get("https://www.google.com/search?q=selenium+webdriver");    
		java.util.List<WebElement> links = driver.findElements(By.tagName("h3"));  
//	    System.out.println(links.size());
	    
		    for (int i = 1; i<=links.size()-1; i=i+1)
		    
		    {		    
			    if(links.get(i).getText().contains("What is Selenium WebDriver?")){
			    	
			    	if(i==3){
			    		
			    		System.out.println("this is the third");
	
			    	}
			    	else{
	
			    		System.out.println("this is not the third");
	
			    	}
			    	
			    }		    
		    }
		
	}
	

	//upload image and check upload status
	public void upload(){
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		WebElement UploadImg = driver.findElement(By.id("file-upload"));
		UploadImg.sendKeys("d:\\5.PNG");
		driver.findElement(By.id("file-submit")).click();
		
		if (driver.findElements( By.tagName("h3")).size() != 0)
			{
	    		System.out.println("Image uploaded successfully!!!");
			
			}
			else
			{
	    		System.out.println("Image not uploaded");
				
			}

		
	}

	//navigate to link and wait for elment to appear
	public void dynamic_loading(){
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
		driver.findElement(By.xpath("//button[contains(.,'Start')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h4")))));
		System.out.println(driver.findElement(By.id("finish")).getText());

	}

}
