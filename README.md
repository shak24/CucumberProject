
---

## Tools and Libraries
This project using 2 main tools, Selenium and Cucumber.
On the other hand, I am using some of the tools that support this great framework.
The complete list of tools, you can see in the `pom.xml` file.

## Requirements
* Java Development Kit
* Maven
* WebDriver, using ChromeDriver

## Running Tests
* Clone the repository from your fork to this directory
* Open the project using any Java IDE
* Run the tests with the script below
```shell

mvn clean -Dtest=TestRunner test -Dcucumber.feature="src/test/resources/Features.login.feature"
## Scenario 1
* Members can add items to shopping cart with valid credentials




## Scenario 2
* Guests can add items to shopping cart with out needing to have any credentials
```