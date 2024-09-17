# POM, Cucumber, Selenium, JUnit Framework

This project implements a test automation framework combining the **Page Object Model (POM)** with **Cucumber**, **Selenium WebDriver**, and **JUnit**. It facilitates Behavior-Driven Development (BDD) using Cucumber, with Selenium to automate browser actions and JUnit to manage test execution.

## Features
- **Page Object Model (POM)**: Enhances test maintainability by separating test logic and UI interactions.
- **Cucumber BDD**: Write test scenarios in Gherkin for readable and easy-to-understand tests.
- **Selenium WebDriver**: Automates browser interactions for web-based applications.
- **JUnit**: Manages test execution and assertions.

## Prerequisites
- Java 8+
- Maven
- ChromeDriver/GeckoDriver for browser automation

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/imcvk/pom-cucumber-selenium-junit.git
   
**Navigate to the project folder:**

`cd pom-cucumber-selenium-junit`

**Install dependencies:**

`mvn clean install`

**Run the tests:**

`mvn test`

**Folder Structure**

* src/main/java: Contains the Page Object Model classes.
* src/test/java: Test cases and step definitions for Cucumber.
* src/test/resources/features: Cucumber feature files written in Gherkin.
* drivers: WebDriver binaries (Chrome/Firefox).

**Reporting**

The framework can be extended with Allure or other reporting tools for better test execution reports.

**Customization**

You can easily modify the framework by adding new feature files, Page Object classes, or test cases to fit your project requirements.

**License**

This project is open-source and available under the MIT License.
This `README.md` provides an overview of the project, setup instructions, and a folder structure guide.
