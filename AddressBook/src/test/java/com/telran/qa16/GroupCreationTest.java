package com.telran.qa16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sergio on 16.07.2018.
 */
public class GroupCreationTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd= new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook");
        login("admin","secret");
    }

    private void login(String user, String password) {
        wd.findElement(By.)
    }
}
