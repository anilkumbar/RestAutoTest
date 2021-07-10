import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class seleniumTest {

    // Xpath= "//select[@id='country']//parent::div/../../following::div//descendant::label[contains(text(),'State')]"
    // URL = "https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html"
    public static void main(String[] args) throws InterruptedException {

        HashMap<String, String> hashMap= new HashMap<String, String>();
        hashMap.put("Admin","admin123");
        hashMap.put("customer","cut123");
        hashMap.put("Author","auth123");
        hashMap.put("client","client123");

       for(Map.Entry m:hashMap.entrySet())
        {
            System.out.println(m.getKey());
        }
      //  System.out.println(hashMap.get("Admin"));
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ankumbar\\Downloads\\geckodriver\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

/*Handling Alerts*/
//alert accept        driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
//alert send       driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
//       System.out.println("Clicked");
//        Thread.sleep(3000);
//        Alert alert= driver.switchTo().alert();
//alert1        alert.accept();
//alert send        alert.sendKeys("Anil Kumbar");
//alert send        alert.accept();
        System.out.println("Accepted");


        /*Downloading File*/
        driver.findElement(By.xpath("(//a[contains(text(),'Alerts & Modals')])[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'File Download')])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing");
        Thread.sleep(1000);
        driver.findElement(By.id("create")).click();
        driver.findElement(By.id("link-to-download"));

        StringSelection strSelection = new StringSelection("");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(strSelection, null);







/*To scroll using java script executor*/
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,5000)");

/*Select values from drop down*/
//        WebElement webElement=driver.findElement(By.xpath("//select[@id='country']"));
//        Select sel = new Select(webElement);
//        sel.selectByVisibleText("India");
//        WebElement webElement1=driver.findElement(By.xpath("//select[@id='country']//parent::div/../../following::div//descendant::label[contains(text(),'State')]"));
//        Select sel1 = new Select(webElement1);
//        sel.selectByVisibleText("Alaska");
//        driver.close();



    }
}
