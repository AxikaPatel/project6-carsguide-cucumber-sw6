@regression
Feature: Search functionality

  @sanity
  Scenario Outline:  Search the buy car with model
    Given           I am on homepage
    When            I mouse hover on “buy+sell” tab
    And             I click ‘Search Cars’ link
    Then            I navigate to ‘new and used car search’ page
    And             I select make "<make>"
    And             I select model "<model>"
    And             I select location "<location>"
    And             I select price "<price>"
    And             I click on Find My Next Car tab
    Then            I should see the make "<verifymakePage>" in results

    Examples:
      | make  | model   | location           | price |verifymakePage                                                     |
      |Nissan |Qashqai  |NSW - Central West  |$50,000|86 Nissan Qashqais for Sale under $50,000 in Central West, NSW     |
      |Honda  |Civic    |QLD - All           |$35,000|49 Honda Civics for Sale under $35,000 in QLD                      |
      |Toyota |Any Model|TAS - North         |$20,000|39 Toyotas for Sale under $20,000 in North, TAS                    |
      |Suzuki |Any Model|NSW - New England   |$80,000|144 Suzukis for Sale under $80,000 in New England, NSW             |
      |Hyundai|Any Model|Any Location        |$80,000|4,953 Hyundais for Sale under $80,000                              |
      |Mini   |Clubman  |Any Location        |$70,000|24 Mini Clubmans for Sale under $70,000                            |

  @smoke
  Scenario Outline: Search the used car with model
    Given           I am on homepage
    When            I mouse hover on “buy+sell” tab
    And             I click 'Used' link
    Then            I navigate to 'Used Cars For Sale' page
    And             I select make "<make>"
    And             I select model "<model>"
    And             I select location "<location>"
    And             I select price "<price>"
    And             I click on Find My Next Car tab
    Then            I should see the make "<verifymakePage>" in results

    Examples:
      | make  | model   | location           | price |verifymakePage                                                     |
      |Nissan |Qashqai  |NSW - Central West  |$50,000|79 Used Nissan Qashqais for Sale under $50,000 in Central West, NSW|
      |Honda  |Civic    |QLD - All           |$35,000|49 Used Honda Civics for Sale under $35,000 in QLD                 |
      |Toyota |Any Model|TAS - North         |$20,000|39 Used Toyotas for Sale under $20,000 in North, TAS               |
      |Suzuki |Any Model|NSW - New England   |$80,000|63 Used Suzukis for Sale under $80,000 in New England, NSW         |
      |Hyundai|Any Model|Any Location        |$80,000|4,384 Used Hyundais for Sale under $80,000                         |
      |Mini   |Clubman  |Any Location        |$70,000|16 Used Mini Clubmans for Sale under $70,000                       |