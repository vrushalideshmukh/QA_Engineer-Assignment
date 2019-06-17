# QA_Engineer-Assignment

-Regression Tests are written in Java using selenium Webdriver.

-For creating this assignment POM(page object model) approach is used,in which testcases are created under one package and methods 
for different pages of application are created in another package

-The source code is present under "src/com", which is as below

 "src/com" -> "TestCases.xlsx"      :: Manual testcase scenarios are attached.
 
 "src/com" -> "RegressionTestcases" :: Folder which contains automated testcases for Add computer and update computer scenarios.
 
 "src/com" -> "application/pages"   :: Logic to execute the testcases are present.
 
 "src/com" -> sel/utlity            :: Common instance is created which is used to instantiate the browser.
 

Set up:

-To run this selenium Webdriver you need to have selenium setup.

-chrome driver.exe is already present in the project.

Running the testcases:


-For add computer testcases run AddComputerTestCase.java.

-For update computer testcases run UpdatecomputerTestcase.java
