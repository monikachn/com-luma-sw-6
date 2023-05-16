package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenPageTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on Men menu$")
    public void iMouseHoverOnMenMenu() {
        new MenPage().mouseHoverOnMenMenu();
    }

    @And("^I mouse hover on bottoms$")
    public void iMouseHoverOnBottoms() {
        new MenPage().mouseHoverOnBottoms();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }

    @And("^I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() {
        new MenPage().sortByProductName();
        new MenPage().clickOnCronousSize32();
    }

    @And("^I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().clickOnCronousBlack();
    }

    @And("^I Mouse Hover on product name‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenPage().mouseHoverOnCronusYogaAndClickAddCart();
    }

    @And("^I mouse hover on product name$")
    public void iMouseHoverOnProductName() {
        new MenPage().mouseHoverOnProductName();
    }

    @Then("^I verify You added Cronus Yoga Pant to your shopping cart$")
    public void iVerifyYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new MenPage().getSuccessMsgText(),"You added Cronus Yoga Pant to your shopping cart.");
    }

    @And("^I click on Shopping Cart link$")
    public void iClickOnShoppingCartLink() {
        new MenPage().clickOnShoppingCartLink();
    }

    @And("^I verify shopping  cart text$")
    public void iVerifyShoppingCartText() {
        Assert.assertEquals(new MenPage().getShoppingCartText(),"Shopping Cart");
    }

    @And("^I verify product name Cronus Yoga pant$")
    public void iVerifyProductNameCronusYogaPant() {
        Assert.assertEquals(new MenPage().getProductName(),"Cronus Yoga Pant");
    }

    @Then("^I verify product colour black$")
    public void iVerifyProductColourBlack() {
       Assert.assertEquals(new MenPage().getProductColour(),"Black");
    }

    @And("^I verify product size$")
    public void iVerifyProductSize() {
        Assert.assertEquals(new MenPage().getProductSize(), "32");
    }
}
