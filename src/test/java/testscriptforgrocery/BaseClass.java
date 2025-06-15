package testscriptforgrocery;

import org.testng.annotations.Test;

import constant.Constant;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
 
 public WebDriver driver;
 public Properties properties;
public FileInputStream fis;
  @BeforeMethod(alwaysRun = true)
  @Parameters("browsers")

	    public void beforeMethod(String browser) throws Exception//This method is for calling browser through xml 
	    {
	        try
	        {
	            properties = new Properties();
	            fis = new FileInputStream(Constant.CONFIGFILE);
	            properties.load(fis);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            throw new Exception("Configuration file not found.", e);
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new Exception("Error loading configuration.", e);
	        }

	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        } else {
	            throw new Exception("Invalid browser: " + browser);
	        }
	  
	  driver.get(properties.getProperty("url"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
	    

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
  }
  }
