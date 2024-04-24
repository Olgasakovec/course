Feature: UserGuide automation

  Scenario: Check the User Guide button text
    Given Open browser and maximize window
    When Navigate to the 'https://junit.org/junit5/' url
    Then Verify that User Guide button text is 'User Guide'


  Scenario: Check TestNG Annotations columns
    Given Navigate to the page 'https://testng.org/' url
    When Maximize window
    And Click to the link '3. TestNG Documentation'
    And Navigate to the menu '3.2. Annotations'
    Then Check that table consist 3 columns

  Scenario: Check image format
    Given Navigate to the webpage 'https://testng.org/' url
    When Window maximize
    And Click to the link in the left menu '13. The TestNG TextBook: Next Generation Java Testing'
    Then Check that image format is .jpg

  Scenario Outline: Compare string lengths
    Then Verify that length of 'string1' should be greater than the length of 'string2'
    Examples:
      | string1 | string2 |
      | tested  | testing |
      | test    | tester  |