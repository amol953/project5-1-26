package stepsdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("on login page");

    }

    @When("user enter username")
    public void userEnterUsername() {
        System.out.println("enter username");

    }

    @And("user enter password")
    public void userEnterPassword() {
        System.out.println("enter password");
    }

    @Then("User enter next page")
    public void userEnterNextPage() {
        System.out.println("on next page");
    }

    @When("user enter username {string}")
    public void user_enter_username(String Un) {
        System.out.println(" the username is :"+Un
        );
    }

    @When("user enter password {string}")
    public void user_enter_password(String Passwd) {
        System.out.println("the password is :"+Passwd);
    }

    @Then("User enter next page and text {string} should be compared")
    public void user_enter_next_page_and_text_should_be_compared(String text) {
        System.out.println("the enter text is "+text);
    }
}