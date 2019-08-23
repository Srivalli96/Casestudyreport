Feature: My validations on TestMeApp Application

  # @Regression
  # Scenario Outline: Guest User registration in TestMeApp
  #Then User clicks on SignUp link
  #Then user enters username "<uname>"
  #And user enters first name  "<fname>"
  #Then user enters last name "<lname>"
  #Then user enters password "<pswrd>"
  #Then user enters confirm password "<cpswrd>"
  #Then user selects the gender
  #And user enters email "<email>"
  #Then user enters mobile number "<mobile num>"
  #Then user enters dob "<dob>"
  #Then user enters address "<address>"
  #Then user selects security question
  #And user enters answer
  #And User clicks on submit button available
  #Then verifies registration process
  #Examples:
  # | uname        | fname  | lname   | pswrd     | cpswrd    | email               | mobile num | dob      | address             |
  # | aakansha1123 | priya  | drashti | 147852369 | 147852369 | priya99@gmail.com   | 1234567890 | 5/6/2001 | 7/9/1 kkd ,mainroad |
  #| nimisha0092  | sanaya | vithika | 369852147 | 369852147 | kranthi33@gmail.com | 9874563210 | 6/9/1999 | 5/6 hyd,ramnagar    |
  @Smoke
  Scenario Outline: login with different credentials
    Given enter valid username "<uname>"
    And enter valid password "<pswrd>"
    Then click on login button
    And verify login process

    Examples: 
      | uname   | pswrd       |
      | lalitha | Password123 |

  @Smoke
  Scenario: Searching and purchasing of the product
    Given user enters the product name
    Then user clicks on add to cart
    And clicks on cart link
    Then clicks on checkout button
    And clicks on proceed to pay
    Then selects the bank and clicks on continue button
    And enters username and password of bank
    Then clicks on login button
    Then enter transaction password
    And click on paynow button
    Then verifies the payment process

  @Smoke
  Scenario: The one where the user moves to the cart without adding any item in it
    Given user has registered into TestMeApp
    When user search a particular product like headphones
    And try to proceed to payment without adding any item in the cart
    Then TestMeApp does not display the cart icon
