package com.sauce.stepDefinitions;


import com.sauce.pages.CheckoutCompletePage;
import io.cucumber.java.en.And;

public class CheckoutComplete_StepDefs {
    CheckoutCompletePage checkoutCompletePage=new CheckoutCompletePage();
    @And("The user should take success shopping message: {string}")
    public void theUserShouldTakeSuccessShoppingMessage(String expectedMessage) {
        checkoutCompletePage.verifySuccessShoppingWithMessage(expectedMessage);
    }
}
