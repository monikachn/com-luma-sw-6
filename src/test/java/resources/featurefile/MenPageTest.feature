Feature: MenPage Test
  As a user I should add product to shopping cart successfully
  @sanity @regression
  Scenario: User should add products to shopping cart successfully
    Given I am on homepage
    When I mouse hover on Men menu
    And I mouse hover on bottoms
    And I click on Pants
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button
    Then I verify You added Cronus Yoga Pant to your shopping cart
    And I click on Shopping Cart link
    And I verify shopping  cart text
    And I verify product name Cronus Yoga pant
    And I verify product size
    Then I verify product colour black