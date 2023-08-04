package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(tagName = "input")
    public List<WebElement> loginInputs;


    public void login(String userName,String password){
        loginInputs.get(0).sendKeys(userName);
        loginInputs.get(1).sendKeys(password);
        loginInputs.get(2).click();
    }
}
