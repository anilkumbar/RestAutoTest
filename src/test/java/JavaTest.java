import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.util.*;

public class JavaTest {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Anil");
        list.add("Ravi");
        list.add("Yash");
        /*Using Iterator to traverse elements*/
        Iterator itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        /*Using for loop*/
        System.out.println("---------------------------");
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        /*Using advanced for loop*/
        System.out.println("---------------------------");
        for(String l:list){
            System.out.println(l);
        }

        System.out.println("------------Map---------------");
        HashMap<String, String> hashMap= new HashMap<String,String>();
        hashMap.put("Anil", "123");
        hashMap.put("Sunil", "993");
        hashMap.put("Yash", "0903");
        for(Map.Entry m:hashMap.entrySet())
        {
            System.out.println(m.getValue());
        }
    /*Assert Hardassert*/
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals("Anil","Anil");
        Assert.assertNotEquals("Anil","Arun");
        Assert.assertNull(null);
        Assert.assertNotNull(10);

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(true,"");

      /*Set window size*/
        Dimension d= new Dimension(400,600);
        WebDriver driver= new FirefoxDriver();
     //   driver.manage().window().setSize(d);



    }
}
