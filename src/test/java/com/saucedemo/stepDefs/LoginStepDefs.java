package com.saucedemo.stepDefs;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user type in valid credentials {string} and {string}")
    public void the_user_type_in_valid_credentials_and(String username, String password) {
        loginPage.login(username, password);
    }
}
