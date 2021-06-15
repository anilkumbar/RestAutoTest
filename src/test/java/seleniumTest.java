import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class seleniumTest {

    // Xpath= "//select[@id='country']//parent::div/../../following::div//descendant::label[contains(text(),'State')]"
    // URL = "https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html"
    public static void main(String[] args) {

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
        driver.get("https://www.seleniumeasy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);


        driver.findElement(By.xpath("//header[@id='navbar']//child::a[contains(text(),'TestNG')]")).click();

        System.out.println("Clicked");
//        WebElement webElement=driver.findElement(By.xpath("//select[@id='country']"));
//        Select sel = new Select(webElement);
//        sel.selectByVisibleText("India");
//        WebElement webElement1=driver.findElement(By.xpath("//select[@id='country']//parent::div/../../following::div//descendant::label[contains(text(),'State')]"));
//        Select sel1 = new Select(webElement1);
//        sel.selectByVisibleText("Alaska");
//        driver.close();



    }
}
