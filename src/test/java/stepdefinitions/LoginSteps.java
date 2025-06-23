package stepdefinitions;

import com.microsoft.playwright.Page;
import enums.EnvConfig;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
    private Page page;
    private LoginPage loginPage;

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        page = Hooks.page;  // get shared page from Hooks
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
        assert page.url().contains("customer/account");
    }
}
