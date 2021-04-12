# selenium-testng
Test automation with selenium-TestNG TDD framework designed with Page Object Model pattern

TestNG - Test Next Generation - TDD (Test Driven development) Testing Framework implemented on top of Java fir writing and organizing test cases/suites and getting reports
TestNG is designed to cover all categories of tests: unit, functional, end-to-end, integration, etc.

Advantages of using TestNG-
1. Manage Test Suites and Test cases
2. Test Prioritization
3. Test Grouping
4. Parallel Execution
5. Reporting

# Automation Framework features
WebDrivers :
- Chrome, Firefox
- The choice of WebDriver can be changed by changing 'browser' property value from testng.xml file


# Execution :
- Execute maven test goal or 'mvn clean test' to trigger execution


# This Framework covers -

Annotation
1.	@BeforeSuite
2.	@AfterSuite
3.	@BeforeClass
4.	@AfterClass
5.	@BeforeTest
6.	@AfterTest
7.	@BeforeGroups
8.	@AfterGroups
9.	@BeforeMethod
10.	@AfterMethod
11.	@DataProvider
12.	@Factory
13.	@Listeners
14.	@Parameters
15.	@Test

Prioritizing and Disabling Tests
examples -  
@Test(priority=1)
void methodX(){
//logic
}

@Test(priority=2, enabled=false)
void methodY(){
//logic
}

Dependency Tests and Always Run
examples -  
@Test
void m1(){
//logic
}

@Test(dependsOnMethods={"m1"})
void m2(){
//logic
}

@Test(dependsOnMethods={"m1","m2"},alwaysRun=true)
void m3(){
//logic
}

Grouping Tests
examples -  
@Test(groups={"sanity"})
void m1(){
//logic
}

@Test(groups={"sanity","regression"})
void m2(){
//logic
}

Assertion in TestNG
Assert.assertTrue()
Assert.assertFalse()
Assert.assertEquals()

Parameters in TestNG
Example-
@BeforeClass
@Parameters({"browser","url"})
void m1 (){
}

@DataProvider

Parallel Test

TestNG Listeners

Extent Reports
