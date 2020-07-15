$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/resources.feature");
formatter.feature({
  "line": 1,
  "name": "Resources Page",
  "description": "   As a user i want to view a list of resources available to me so that i can \r\n       have assistance hiring the right talent",
  "id": "resources-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8378333800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to view list of Resources",
  "description": "",
  "id": "resources-page;user-should-be-able-to-view-list-of-resources",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user navigates to insights",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects Resources",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be taken to resources page",
  "keyword": "Then "
});
formatter.match({
  "location": "ResourcesSteps.a_user()"
});
formatter.result({
  "duration": 319051500,
  "status": "passed"
});
formatter.match({
  "location": "ResourcesSteps.user_navigates_to_insights()"
});
formatter.result({
  "duration": 177946800,
  "status": "passed"
});
formatter.match({
  "location": "ResourcesSteps.selects_Resources()"
});
formatter.result({
  "duration": 3526079800,
  "status": "passed"
});
formatter.match({
  "location": "ResourcesSteps.user_should_be_taken_to_resources_page()"
});
formatter.result({
  "duration": 3016170800,
  "status": "passed"
});
formatter.after({
  "duration": 687883200,
  "status": "passed"
});
});