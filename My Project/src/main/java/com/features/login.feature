Feature: Accounting

@login
Scenario: login test

Given user should be on login page
When user enters valid credentials
Then user should be on home page

@customer
Scenario: seles test

Given user should be on seles page
When user should fill details of new costomers
Then user can see new costomer name

@NewGroup
Scenario: salesgroup test

Given user should be on sales page
When user should be create new sale groups
Then use can see new sales group Name and Id

@UpdateSlGrp
Scenario: update test

Given user should be on sales group page
When user should be update  the sales group
Then user can see upadeted massage


@DeleteGroups
Scenario: dalete sale test

Given user should be on sales group page
When user should be delete  the sales group
Then user can see deleted massage

@SaleType
Scenario: Sale Types test

Given user should be on sales types page
When user should add new sales types
Then user can see msg of new sale type added

@salesPerson
Scenario: Sales Persons

Given user should be on sale persons page
When user should add new persons dada
Then user can see new sale person Dada


@saleArea
Scenario: SaleArea test

Given user should be on sales areas page
When user should be udate the sales area name
Then user can see updated sales area name


@logout
Scenario: LogOut test

Given user should be login
When user should click on logout button
Then user can see the massage of logout