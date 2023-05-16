package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[7]")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffle;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(id = "qty")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='control qty']//input")
    WebElement changeQty5;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Update Shopping Cart')]")
    WebElement upDateCart;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement txtAddedDuffleToCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]" )
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='control qty']//input")
    WebElement verifyQty3;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
    WebElement verifyProductPrice;

    public void mouseHoverOnGear() {
       log.info("Mouse Hover On Gear" + gearMenu.toString());
        mouseHoverToElement(gearMenu);

    }

    public void clickOnBags() {
       log.info("Click on bags" + bags.toString());
        clickOnElement(bags);
    }

    public void clickOnProductName() {

       log.info("Click on product name" + overnightDuffle.toString());
        clickOnElement(overnightDuffle);

    }

    public void changeQty() {

       log.info("Change Qty" + changeQty.toString());
        changeQty.clear();
        changeQty.sendKeys("3");
    }

    public void clickOnAddToCart() {

       log.info("Click on Add to cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    // Change Qty to ‘5’
    public void changeQty5() {
       log.info("Change Qty 5" + changeQty5.toString());
        changeQty5.clear();
        changeQty5.sendKeys("5");
    }
    public void updateCart(){
       log.info("Mouse Hover On Gear" + gearMenu.toString());
        clickOnElement(upDateCart);
    }
   public void verify(String xpath, String msg) {
        List<WebElement> m1Element = driver.findElements(By.xpath("//strong[@class='product-item-name']"));
        for (WebElement list : m1Element) {
            String name1 = list.getText();
            System.out.println(name1);

        }
    }

    public void clickOnShoppingCart() {

       log.info("Click on shopping cart" + clickOnShoppingCart.toString());
        clickOnElement(clickOnShoppingCart);
    }
    public String getProductNameText(){
       log.info("Get product name text" + productName.toString());
        return getTextFromElement(productName);
    }
    public String getTextAddedDuffleToCart(){
       log.info("Get text added duffle to cart" + txtAddedDuffleToCart.toString());
        return getTextFromElement(txtAddedDuffleToCart);
    }

    public String getQty3Text() {
        String expectedMessage = "3";
        WebElement actualTextElement = verifyQty3;
        String actualMessage = actualTextElement.getAttribute("value");
       log.info("change quantity to 3" + verifyQty3.toString());
        return actualMessage;

    }

    public String getProductPrice() {
       log.info("Get product price" + verifyProductPrice.toString());
        return getTextFromElement(verifyProductPrice);

    }


}




