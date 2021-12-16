$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in Funtionality",
  "description": "",
  "id": "log-in-funtionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in  Functionality",
  "description": "",
  "id": "log-in-funtionality;sign-in--functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user should open T-Mobile login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDef.user_should_open_tmobile_login_page()"
});
