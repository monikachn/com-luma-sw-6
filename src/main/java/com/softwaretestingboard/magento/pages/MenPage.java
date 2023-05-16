package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class MenPage extends Utility {

    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[contains(text(),'Men')]")
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement bottoms;


    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickOnPants;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a[@class='product-item-link']\"")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement CronusPant32;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-LnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary'] ")
    WebElement blackColour;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement CronusBlackColour;

    @CacheLookup
    @FindBy(xpath = "//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']")
    WebElement buttonAddToCart;

    @CacheLookup
    @FindBy(xpath = "(//span[text() ='Add to Cart'])[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-product-id='880']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page messages']//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectByProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//main[@id='maincontent']//h1")
    WebElement verifyShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyProductName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColour;


    public void mouseHoverOnMenMenu(){

        log.info("Mouse hover on men menu" + menMenu.toString());
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottoms(){
        log.info("Mouse hover on bottoms" + bottoms.toString());
        mouseHoverToElement(bottoms);
    }
    public void clickOnPants(){
        log.info("Click on Pants" + clickOnPants.toString());
        clickOnElement(clickOnPants);
    }
    // Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    public void cronusYogaPantAndClickOnSize32(){
        log.info("Click on size 32 " + cronusYogaPant.toString());
        mouseHoverToElementAndClick(cronusYogaPant);
    }
//Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.

    public void cronusYogaPantAndColourBlack(){
        log.info("Click on Black cronus Yoga pant" + blackColour.toString());
        mouseHoverToElementAndClick(blackColour);
    }
    public void mouseHoverOnProductName(){
        log.info("Click on Product name" + productName.toString());
        mouseHoverToElementAndClick(productName);
    }
    public void addToCart(){
        log.info("Click on add to cart" + addToCart.toString());
        clickOnElement(addToCart);
        //mouseHoverToElementAndClick(addToCart,"Add to Cart");
        List<WebElement> multiElement = driver.findElements(By.xpath("//div[@class='message-success success message']"));

        System.out.println("Total Items are: " + multiElement.size());
        for (WebElement list : multiElement) {
            String name1 = list.getText();
            System.out.println(name1);

        }

    }
    public void clickOnShoppingCartLink(){
        log.info("Click on shopping cart" + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public void sortByProductName() {
        log.info("Sort by product name" +selectByProductName.toString());
        selectByValueFromDropDown(selectByProductName, "name");
    }

    public void clickOnCronousSize32() {
        log.info("Click on Cronus size 32" + CronusPant32.toString());
        clickOnElement(CronusPant32);
    }
    public void clickOnCronousBlack() {
        log.info("Click on Cronus black color" + CronusBlackColour.toString());
        clickOnElement(CronusBlackColour);
    }

    public void mouseHoverOnCronusYogaAndClickAddCart() {
        log.info("Click on Cronus yoga pant and add to cart" + productName.toString());
        mouseHoverToElement(productName);
        clickOnElement(buttonAddToCart);
    }

    public String getSuccessMsgText() {
        log.info("Get success message" + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public String getShoppingCartText() {
        log.info("Get shopping cart text" + verifyShoppingCartText.toString());
        return getTextFromElement(verifyShoppingCartText);
    }

    public String getProductName() {
        log.info("Get product name" + verifyProductName.toString());
        return getTextFromElement(verifyProductName);
    }

    public String getProductSize() {
        log.info("Get product size" + verifyProductSize.toString());
        return getTextFromElement(verifyProductSize);
    }

    public String getProductColour() {
        log.info("Get product color" + verifyProductColour.toString());
        return getTextFromElement(verifyProductColour);
    }
}
