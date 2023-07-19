
  package Browseropenandout;
  
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement; 
  import org.openqa.selenium.chrome.ChromeDriver;
  
  //hello edited from github111
  public class BrowserloginAndOut { public static void main(String[] args) {
  
  System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
  driver.get("https://jar-download.com/artifacts/org.seleniumhq.selenium ");
  WebElement element = driver.findElement(By.id("myElement")); element.click();
  
  // Close the browser 
  driver.quit(); 
  }
  }
  
  
  
  
 
