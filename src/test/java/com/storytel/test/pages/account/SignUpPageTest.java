package com.storytel.test.pages.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class SignUpPageTest {

    WebDriver driver;
    SignUpPage signUpPage;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Instantiating LoginPage using initElements()
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    }

        //All your tests and assertions

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}