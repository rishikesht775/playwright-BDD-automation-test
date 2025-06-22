package stepdefinitions;

import base.BaseTest;
import enums.EnvConfig;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps extends BaseTest {
    LoginPage loginPage;

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        loginPage = new LoginPage(page);
        loginPage.navigateTo(EnvConfig.LOGIN_URL.getValue());
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {
        loginPage.login(
            EnvConfig.VALID_USERNAME.getValue(),
            EnvConfig.VALID_PASSWORD.getValue()
        );
    }

    @Then("I should be logged in successfully")
    public void verifyLoginSuccess() {
        assert loginPage.getPage().url().contains("customer/account");
    }
}