package week10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {
	 public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "D:\\OneDrive\\Desktop\\ATT\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://gmail.com/");
  Thread.sleep(2000);
  WebElement createAccount = driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
  createAccount.click();
  Thread.sleep(2000);
  WebElement forPersonalUse = driver.findElement(By.xpath("(//span[normalize-space()='For my personal use'])[1]"));
  forPersonalUse.click();
  Thread.sleep(2000);
  WebElement firstName = driver.findElement(By.name("firstName"));
  firstName.sendKeys("Kumar01");
  Thread.sleep(2000);
  WebElement lastName = driver.findElement(By.name("lastName"));
  lastName.sendKeys("Ravi");
  Thread.sleep(2000);
  WebElement nextBtn1 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
  nextBtn1.click();
  Thread.sleep(3000);
  Select monthDropdown = new Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
  monthDropdown.selectByValue("8");
  Thread.sleep(2000);
  WebElement dayOfBirth = driver.findElement(By.xpath("(//input[@id='day'])[1]"));
  dayOfBirth.sendKeys("24");
  Thread.sleep(2000);
  WebElement yearOfBirth = driver.findElement(By.xpath("(//input[@id='year'])[1]"));
  yearOfBirth.sendKeys("1996");
  Thread.sleep(2000);
  Select genderDropdown = new Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
  genderDropdown.selectByValue("1");
  Thread.sleep(2000);
  WebElement nextBtn2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
  nextBtn2.click();
  Thread.sleep(2000);
//  WebElement createYourOwn = driver.findElement(By.xpath("//div[contains(text(), 'Create your own Gmail address')]"));
//  createYourOwn.click();
//  Thread.sleep(2000);
  WebElement username = driver.findElement(By.name("Username"));
  username.sendKeys("Kmrthakla");
  WebElement nextBtn3 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
  nextBtn3.click();
  Thread.sleep(2000);
  WebElement password = driver.findElement(By.name("Passwd"));
  password.sendKeys("Cmrit123#");
  WebElement confirmPassword = driver.findElement(By.name("PasswdAgain"));
  confirmPassword.sendKeys("Cmrit123#");
  WebElement nextBtn4 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
  nextBtn4.click();
  
}
}

