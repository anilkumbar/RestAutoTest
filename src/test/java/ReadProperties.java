import org.junit.Before;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Properties;
import lombok.*;

@Setter
@Getter
public class ReadProperties {
   public static Properties p;
   public static FileReader fs;


    private String UserName;
    private String PassWord;

    public String getUserName() {
        return p.getProperty("UserName");
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return p.getProperty("PassWord");
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public static void main(String[] args) throws IOException {
        fs  = new FileReader("src/test/resources/TestData.Properties");
        p = new Properties();
        p.load(fs);
        ReadProperties r=new ReadProperties();
        System.out.println(r.getUserName());
        System.out.println(r.getPassWord());
    }
}
