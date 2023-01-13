package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.ItemPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }


    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }

    public void addItem(){
        this.driver.findElement(InventoryPage.addToCartButton).click();
    }

    public void goToCart(){
         this.driver.findElement(InventoryPage.cartItemsButton).click();
    }

}
