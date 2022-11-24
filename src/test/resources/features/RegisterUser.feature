@autoex
Feature: US001 Automation Exercise sayfasindaki testler yapilmalidir

  @aetc01
  Scenario: TC01 Register User

    Given Launch browser and Navigate to url "automationexerciseUrl"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter name and email address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button
    And Close browser

  @aetc01
  Scenario: TC02 Login User with correct email and password

    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Click 'login' button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible
    And Close browser

  @aetc01
  Scenario: TC03 Login User with incorrect email and password

    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify 'Login to your account' is visible
    And Enter incorrect email address and password
    And Click 'login' button
    And Verify error 'Your email or password is incorrect!' is visible
    And Close browser

  @aetc01
  Scenario: TC04 Logout User
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Click 'login' button
    And Verify that Logged in as username is visible
    And Click Logout button
    And Verify that user is navigated to login page
    And Close browser

  @aetc01
  Scenario: TC05 register User with existing email
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist! is visible
    And Close browser

  @aetc01
  Scenario: TC06 Contact Us From
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on 'Contact Us' button
    And Verify GET IN TOUCH is visible
    When Enter name, email, subject and message
    And Upload file
    And Click Submit button
    And Click OK button
    And Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully
    And Close browser

  @aetc01
  Scenario: TC07 Verify Test Cases Page
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Test Cases button
    And Verify user is navigated to test cases page successfully
    And Close browser

  @aetc01
  Scenario: TC08 Verify All Products and product detail page
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on 'View Product' of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand
    And Close browser

  @aetc01
  Scenario: TC09 Search Product
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    And Close browser

  @aetc01
  Scenario: TC10 Verify Subscription in home page
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible
    And Close browser

  @aetc01
  Scenario: TC11 Verify Subscription in cart page
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible
    And Close browser

  @aetc01
  Scenario: TC12 Add Products in cart
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price
    And Close browser

  @aetc01
  Scenario: TC13 Verify Product Quantity in cart
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Click 'View Product' for any product on home page
    And Verify product detail is opened
    And Increase quantity to 4
    And Click Add to cart button
    And Click View Cart button
    And Verify thatt product is displayed in cart page with 4 exact quantity

  @aetc14
  Scenario: TC14 Place Order: Register while Checkout
    Given Launch browser and Navigate to url "automationexerciseUrl"
    When Verify that home page is visible successfully
    And Add products to cart
   And Verify that cart page is displayed
   And Click Proceed To Checkout
   And Click Register Login button
   And Fill all details in Signup and create account
   And Verify ACCOUNT CREATED! and click Continue button
   And Verify Logged in as username at top
   And Click Cart1 button
   And Click Proceed To Checkout button
   And Verify Address Details and Review Your Order
   And Enter description in comment text area and click Place Order
   And Enter payment details: Name on Card, Card Number, CVC, Expiration date
   And Click Pay and Confirm Order button
   And Verify success message Your order has been placed successfully!
   And Click Delete Account button
   And Verify ACCOUNT DELETED! and click Continue button


















