package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceHomePageSteps {
    @Given("user navigates to salesforce login page")
    public void loginPage(){

    }

    @When("user enters the username {string} and password {string}")
    public void userNameAndPassword(String username, String password) {
    }

    @And("user clicks on login button")
    public void clickLoginButton() {
    }

    @Then("user validates the navigation to the homepage")
    public void validateHomepage() {
    }

    @Then("user validates the error message")
    public void validateErrorMessage() {
    }


}
