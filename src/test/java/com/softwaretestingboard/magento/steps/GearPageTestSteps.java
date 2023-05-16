package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearPageTestSteps {

    @Given("^I am on the homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on Gear Menu$")
    public void iMouseHoverOnGearMenu() {
        new GearPage().mouseHoverOnGear();
    }

    @And("^I click on Bags$")
    public void iClickOnBags() {
        new GearPage().clickOnBags();
    }

    @And("^I click on product name Overnight Duffle$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductName();
    }

    @And("^I change quantity to (\\d+)$")
    public void iChangeQuantityTo(int arg0) {
        new GearPage().changeQty();
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new GearPage().clickOnAddToCart();
    }

    @Then("^I verify text You added overnight duffle to you shopping cart$")
    public void iVerifyTextYouAddedOvernightDuffleToYouShoppingCart() {
        Assert.assertEquals(new GearPage().getTextAddedDuffleToCart(),"You added Overnight Duffle to your shopping cart.");
    }

    @And("^I click on Shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new GearPage().clickOnShoppingCart();
    }

    @And("^I verify the product name Overnight Duffle text$")
    public void iVerifyTheProductNameOvernightDuffleText() {
        Assert.assertEquals(new GearPage().getProductNameText(),"Overnight Duffle");

    }

    @And("^I verify Qty is (\\d+) text$")
    public void iVerifyQtyIsText(int arg0) {
        Assert.assertEquals(new GearPage().getQty3Text(),"3");
    }

    @And("^I should see price is \\$(\\d+)\\.(\\d+)$")
    public void iShouldSeePriceIs$(int arg0, int arg1) {
        String expectedText = "$135.00";
        String actualText = new GearPage().getProductPrice();
        Assert.assertEquals(expectedText, actualText, "Not Displayed");

    }


    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int arg0) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        new GearPage().changeQty5();
    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().updateCart();
    }

    @Then("^I verify the product price$")
    public void iVerifyTheProductPrice() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new GearPage().getProductPrice(),"$225.00");
    }


}
