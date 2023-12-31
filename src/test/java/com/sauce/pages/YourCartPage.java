package com.sauce.pages;

import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage{

    @FindBy (xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> itemsAtTheCartList;

    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutBtn;


    public void verifyAddedItemsToCart(List<String> expectedItemList){
        List<String> actualItemList = BrowserUtils.getElementsText(itemsAtTheCartList);
        Assert.assertTrue(expectedItemList.containsAll(actualItemList));
    }

    public void deleteItemFromCart(String itemName){

        Driver.get().findElement(By.xpath("//div[text()='"+itemName+"']/" +
                "ancestor::div[@class='cart_item_label']//button")).click();
        ProductsPage.addedItemNumber--;


    }

    public void navigateToPage(String pageButton){
        Driver.get().findElement(By.xpath("//*[@name='"+pageButton+"']")).click();
    }

}
