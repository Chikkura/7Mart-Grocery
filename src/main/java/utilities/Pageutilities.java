package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pageutilities {
 public WebDriver driver;
 
 public void selectByvisibleText(WebElement element, String text)
 
 {
	 Select select = new Select(element);
	 select.selectByVisibleText(text);
	 
 }
 
 public void scrollBy(WebDriver driver)
 {
	 JavascriptExecutor scriptExecutor =(JavascriptExecutor)driver;
	 scriptExecutor.executeScript("window.scroll(0,1000)", " ");
 }
}

