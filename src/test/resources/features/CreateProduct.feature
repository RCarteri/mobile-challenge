@newProduct
Feature: Create product

    Background:
        Given I access the new product page

    @newProduct-CT001 @smoke @regression
    Scenario: CT001 - Create Product
        When I fill in the new product form with the dataset
            | code | description | packing | amount | unitValue | lot |
            | 1    | banana      | box     | 3      | 3         | 4   |
        Then the item should appear in the list
        When I remove a quantity item from this product
            | amount | reason | reference |
            | 1      | sell   | 123       |
        Then stock must have less stock