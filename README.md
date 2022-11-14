# DemoQA_TestNG_Automation

### This is a complete project where a DemoQA site is automated by writing test suites using selenium-webdriver and TestNg as testing framework.
The following key modules/pages are automated:

* Practice_Form
* TextBox_Elements

For failed test cases it will take a screenshot aswell at the point of failure.

### Technology:

* Tool: Selenium Webdriver
* IDE: Intellij
* Build tool: Gradle
* Language: Java
* Test_Runner: TestNG

### Prerequisite:
* Need to install jdk 11, gradle and allure
* Configure Environment variable for jdk 11, gradle and allure
* Clone this project and unzip it
* Open the project folder
* Double click on "build.gradle" and open it through IntellIJ IDEA
* Let the project build successfully
* Click on "Terminal" and run the automation scripts

### Run the Automation Script by the following command:

```bash
  gradle clean test 
```
* Selenium will open the browser and start automating.
* After automation to view allure report , give the following commands:

```bash
allure generate allure-results --clean -o allure-report
allure serve allure-results
```
#### Here is the Normal report overview:
<img width="934" alt="DemoQA_report" src="https://user-images.githubusercontent.com/59090637/201707058-9a46dd40-cbf2-4e61-9e48-fbe839d87004.PNG">

#### Here is the Allure report overview:
<img width="935" alt="Allure_Summary_report" src="https://user-images.githubusercontent.com/59090637/201707259-c2029f56-1bbd-4956-b17e-3d5e3d0b380f.PNG">

#### Here are the suites of this project:
<img width="920" alt="Allure_Suits" src="https://user-images.githubusercontent.com/59090637/201707429-c5dc81ac-0be7-4ccb-9939-cdc4230f2733.PNG">
