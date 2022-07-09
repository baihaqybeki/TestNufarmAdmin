Feature: Add Product Category

  @AddValidFile
  Scenario: Validate the positive functionality
    Given Start driver for addproductcategory
    When navigate url for addproductcategory
    And login for addproductcategory
    And click product category tab
    And click add category product button
    And fill name category "kategori 1" 
    And upload file "/Users/muhammadbaihaqy/Desktop/Screen Shot 2022-06-07 at 09.45.04.png"
    And fill the description 
    And click add button
    And close pop up
    And get current link after add category product
    Then to validate add product category move to page
