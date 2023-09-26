package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPages;
import net.serenitybdd.annotations.Step;

public class ValidationsStep extends ValidationPages {
    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }
}
