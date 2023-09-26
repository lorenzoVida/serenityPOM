package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUserName(String username){
            txt_userName.type(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.type(password);
    }
    @Step("Click en el boton login")
    public void clickLogin(){
        btn_loging.click();
    }


}
