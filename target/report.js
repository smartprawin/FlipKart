$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Java/Window7/First/flipkart/src/test/resources/Feature_File/FlipKart1.feature");
formatter.feature({
  "name": "Flipkart Mobile Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search mobile and print all from the flipkart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tags"
    }
  ]
});
formatter.step({
  "name": "Open flipkart page and disable the popup",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipKartHome.open_flipkart_page_and_disable_the_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search mobiles in the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "FlipKartHome.search_mobiles_in_the_search_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print all the Web Element",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipKartHome.print_all_the_Web_Element()"
});
formatter.result({
  "status": "passed"
});
});