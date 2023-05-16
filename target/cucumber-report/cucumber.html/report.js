$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GearPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "GearPage Test",
  "description": "As a user i should add products to shopping cart successfully",
  "id": "gearpage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7449173000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should add products to shopping cart successfully",
  "description": "",
  "id": "gearpage-test;user-should-add-products-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on Gear Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Bags",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on product name Overnight Duffle",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I change quantity to 3",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify text You added overnight duffle to you shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on Shopping cart link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the product name Overnight Duffle text",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify Qty is 3 text",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see price is $135.00",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I change the quantity to 5",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on update shopping cart button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify the product price",
  "keyword": "Then "
});
formatter.match({
  "location": "GearPageTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 104644300,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iMouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 527992300,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iClickOnBags()"
});
formatter.result({
  "duration": 948420300,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iClickOnProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 872119900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "GearPageTestSteps.iChangeQuantityTo(int)"
});
formatter.result({
  "duration": 230117600,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 89886500,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iVerifyTextYouAddedOvernightDuffleToYouShoppingCart()"
});
formatter.result({
  "duration": 1552528200,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iClickOnShoppingCartLink()"
});
formatter.result({
  "duration": 1787560400,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iVerifyTheProductNameOvernightDuffleText()"
});
formatter.result({
  "duration": 28925900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 16
    }
  ],
  "location": "GearPageTestSteps.iVerifyQtyIsText(int)"
});
formatter.result({
  "duration": 43377900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "135",
      "offset": 23
    },
    {
      "val": "00",
      "offset": 27
    }
  ],
  "location": "GearPageTestSteps.iShouldSeePriceIs$(int,int)"
});
formatter.result({
  "duration": 29096400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 25
    }
  ],
  "location": "GearPageTestSteps.iChangeTheQuantityTo(int)"
});
formatter.result({
  "duration": 1075675400,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iClickOnUpdateShoppingCartButton()"
});
formatter.result({
  "duration": 63163900,
  "status": "passed"
});
formatter.match({
  "location": "GearPageTestSteps.iVerifyTheProductPrice()"
});
formatter.result({
  "duration": 2726276100,
  "status": "passed"
});
formatter.after({
  "duration": 182000,
  "status": "passed"
});
formatter.uri("MenPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "MenPage Test",
  "description": "As a user I should add product to shopping cart successfully",
  "id": "menpage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2406445300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should add products to shopping cart successfully",
  "description": "",
  "id": "menpage-test;user-should-add-products-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on Men menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on bottoms",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Pants",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Mouse Hover on product name‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify You added Cronus Yoga Pant to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on Shopping Cart link",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify shopping  cart text",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify product name Cronus Yoga pant",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify product size",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify product colour black",
  "keyword": "Then "
});
formatter.match({
  "location": "MenPageTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 41600,
  "status": "passed"
});
formatter.match({
  "location": "MenPageTestSteps.iMouseHoverOnMenMenu()"
});
formatter.result({
  "duration": 439682200,
  "status": "passed"
});
formatter.match({
  "location": "MenPageTestSteps.iMouseHoverOnBottoms()"
});
formatter.result({
  "duration": 98977800,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable: [object HTMLSpanElement] has no size and location\n  (Session info: chrome\u003d113.0.5672.93)\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [1faceb598881fcf0eb683566fc18d237, actions {actions\u003d[org.openqa.selenium.interactions.Sequence@1de6932a]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\Monika\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:59067}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59067/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 1faceb598881fcf0eb683566fc18d237\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:611)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:567)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:536)\r\n\tat com.softwaretestingboard.magento.utility.Utility.mouseHoverToElement(Utility.java:229)\r\n\tat com.softwaretestingboard.magento.pages.MenPage.mouseHoverOnBottoms(MenPage.java:103)\r\n\tat com.softwaretestingboard.magento.steps.MenPageTestSteps.iMouseHoverOnBottoms(MenPageTestSteps.java:22)\r\n\tat ✽.And I mouse hover on bottoms(MenPageTest.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MenPageTestSteps.iClickOnPants()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iMouseHoverOnProductNameCronusYogaPantAndClickOnSize()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iVerifyYouAddedCronusYogaPantToYourShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iClickOnShoppingCartLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iVerifyShoppingCartText()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iVerifyProductNameCronusYogaPant()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iVerifyProductSize()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MenPageTestSteps.iVerifyProductColourBlack()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1152531700,
  "status": "passed"
});
});