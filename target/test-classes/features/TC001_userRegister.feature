Feature: US001 Register


  Scenario: TC001 User Register

    Then kullanici signup butonunu tiklar
    And kullanici ENTER ACCOUNT INFORMATION yazisinin gorundugunu teyit eder
    When kullanici kayit gormunda istenilen alanlari doldurur
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then kullanici creat account butonuna basar
    And kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder
    When kullanici continue butonunu tıklar
    Then kullanici logged in as username yazisinin gorundugunu teyit eder
    And kullanici delete account butonuna basar
    When kullanici delete account yazisinin gorundugunu teyit eder
    And Close browser




