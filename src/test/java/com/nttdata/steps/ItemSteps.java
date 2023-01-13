package com.nttdata.steps;

import com.nttdata.page.ItemPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemSteps {
    private WebDriver driver;
    public ItemSteps(WebDriver driver){
        this.driver = driver;
    }

    public int getItemCartSize(){
        List<WebElement> itemsCart = this.driver.findElements(ItemPage.itemsCart);
        return itemsCart.size();
    }

    public String getItemName(){
        return this.driver.findElement(ItemPage.cartItemName).getText();
    }
}
