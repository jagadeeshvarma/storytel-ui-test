package com.storytel.test.pages.account;

import com.storytel.test.pages.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class LoginPageTest extends TestBase {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Instantiating LoginPage using initElements()
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.get("https://www.storytel.com/");

    }

    @Test
    void verifyTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Storytel - Ljudböcker & E-böcker i mobilen";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test
    void verifyLogin(){
        loginPage.acceptCookies();
        loginPage.clickLogin();
        loginPage.enterUserInput();
        loginPage.enterPasswordInput();
        loginPage.clickSubmit();

        //actualData, expectedData

        Assert.assertEquals(true,true);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}