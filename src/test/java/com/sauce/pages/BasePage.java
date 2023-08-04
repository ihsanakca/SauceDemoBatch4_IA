package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".shopping_cart_badge")
    public WebElement yourCartQuantity;

    public String  getPageTitle(String pageTitle){
        return Driver.get().findElement(By.xpath("//span[text()='"+pageTitle+"']")).getText();
    }

    public int getQuantity(){
        String quantityText = yourCartQuantity.getText();
        return Integer.parseInt(quantityText);
    }
}
