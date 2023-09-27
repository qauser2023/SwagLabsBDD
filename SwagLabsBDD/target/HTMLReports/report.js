$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/mrobi/eclipse-workspace/SwagLabsBDD/src/test/resources/Features/loginPage.feature");
formatter.feature({
  "name": "Swag Labs Landing page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Swag Labs page title",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the brower",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_the_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should have page title as Swag Labs",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_have_page_title_as_Swag_Labs()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is unable to login without username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the brower",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_the_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});