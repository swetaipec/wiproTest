$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myTest.feature");
formatter.feature({
  "line": 1,
  "name": "Register functionality on Home page of Application",
  "description": "",
  "id": "register-functionality-on-home-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user able to register using valid email id",
  "description": "",
  "id": "register-functionality-on-home-page-of-application;user-able-to-register-using-valid-email-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the Email address",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on create myaccount button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify user is  logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 16183725928,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_Email_address()"
});
formatter.result({
  "duration": 2144080513,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Create_my_account()"
});
formatter.result({
  "duration": 987563849,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_user_loggedIn()"
});
formatter.result({
  "duration": 32987315,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "While registering, if the email address is incorrect. User should see an error message",
  "description": "",
  "id": "register-functionality-on-home-page-of-application;while-registering,-if-the-email-address-is-incorrect.-user-should-see-an-error-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Enter the invalidEmail address",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on create myaccount button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "check system throw an error",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 17241458966,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_invalidEmail_address()"
});
formatter.result({
  "duration": 2428198785,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Create_my_account()"
});
formatter.result({
  "duration": 46837188,
  "status": "passed"
});
formatter.match({
  "location": "Steps.check_error()"
});
formatter.result({
  "duration": 792253598,
  "error_message": "java.lang.AssertionError: expected:\u003cInvalid email address.\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefination.Steps.check_error(Steps.java:155)\r\n\tat ✽.Then check system throw an error(myTest.feature:15)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 19,
  "name": "Checl whether megamenu works_Dresses\u003eSummer dresses",
  "description": "",
  "id": "register-functionality-on-home-page-of-application;checl-whether-megamenu-works-dresses\u003esummer-dresses",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "megamenu Dresses Clicked",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on submenu summer menu",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 12180688517,
  "status": "passed"
});
formatter.match({
  "location": "Steps.megamenu()"
});
formatter.result({
  "duration": 4888030601,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_submenu()"
});
formatter.result({
  "duration": 3626844073,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "sort by price and check grid is arranged properly",
  "description": "",
  "id": "register-functionality-on-home-page-of-application;sort-by-price-and-check-grid-is-arranged-properly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "megamenu Dresses Clicked",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "click on submenu summer menu",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "sort by Price lowest first",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 25912731853,
  "status": "passed"
});
formatter.match({
  "location": "Steps.megamenu()"
});
formatter.result({
  "duration": 4901312591,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_submenu()"
});
formatter.result({
  "duration": 2579557452,
  "status": "passed"
});
formatter.match({
  "location": "Steps.short_by_price()"
});
formatter.result({
  "duration": 90228,
  "status": "passed"
});
});