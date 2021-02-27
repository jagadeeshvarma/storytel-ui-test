package com.storytel.test.pages.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id="cb-button-accept")
    WebElement cbButtonAccept;

    @FindBy(id="loginPageNavigation")
    WebElement loginPageNavigation;

    @FindBy(id="userInput")
    WebElement userInput;

    @FindBy(id="passwordInput")
    WebElement passwordInput;

    @FindBy(id = "loginBtn")
    WebElement loginBtn;


    public void clickLogin(){
        loginPageNavigation.click();
    }
    public void enterUserInput(){
        userInput.sendKeys("");
    }
    public void enterPasswordInput(){
        passwordInput.sendKeys("");
    }
    public void clickSubmit(){
        loginBtn.click();
    }
    public void acceptCookies(){
        cbButtonAccept.click();
    }
}
