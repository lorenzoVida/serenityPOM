package com.swag.pe.definitions;

import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationsStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class loginDef {
 @Steps(shared = true)
    WebSite url;

 @Steps(shared = true)
    LoginStep login;

 @Steps(shared = true)
    ValidationsStep validation;

@Given("que el usuario está en la página de login")
 public void userNavigateTo(){
     url.navigateTo("https://www.saucedemo.com/v1/");
 }

    @When("el usuario ingresa su nombre de usuario y contraseña")
    public void userLoginWithValidateCredentials(){
        login.typeUserName("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("el usuario es redirigido a la página de inicio")
    public void systemShowProductModule(){
        Assert.assertTrue(validation.titleIsVisible());
    }

    @When("el usuario ingresa su nombre de usuario y contraseña inválidos")
    public void userLoginWithInvalidateCredentials(){
        login.typeUserName("standard_user");
        login.typePassword("xdsx");
        login.clickLogin();
    }

    @Then("el usuario ve un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validation.errorMessageIsDisplayed());
    }
}
