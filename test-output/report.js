$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Log in Funtionality",
  "description": "",
  "id": "log-in-funtionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sign in  Functionality",
  "description": "",
  "id": "log-in-funtionality;sign-in--functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open Amazon Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user mouseHover and click on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.user_open_amazon_home_page()"
});
formatter.result({
  "duration": 43828236100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_mousehover_and_click_on_sign_in_button()"
});
formatter.result({
  "duration": 7019973300,
  "status": "passed"
});
});