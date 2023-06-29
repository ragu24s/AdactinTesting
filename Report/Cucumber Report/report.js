$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/co/cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "to validate login module of the website",
  "description": "",
  "id": "to-validate-login-module-of-the-website",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "navigate to the url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 6,
  "name": "to check the login functionality",
  "description": "",
  "id": "to-validate-login-module-of-the-website;to-check-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@A"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "username \"9750308485\" is given",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "password \"24022000\" is given",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "login in",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9750308485",
      "offset": 10
    }
  ],
  "location": "Stepdefintion.username_is_given(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "24022000",
      "offset": 10
    }
  ],
  "location": "Stepdefintion.password_is_given(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefintion.login_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefintion.homepage_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
});