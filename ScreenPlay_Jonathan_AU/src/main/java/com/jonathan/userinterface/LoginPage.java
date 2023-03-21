package com.jonathan.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage extends PageObject {

    public static final Target INPUT_USUARIO =
            the("Campo de ingreso de usuario")
                    .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD =
            the("Campo de ingreso de clave")
                    .locatedBy("//*[@id='password']");

    public static final Target BOTON_LOGIN =
            the("Boton de inicio de sesión")
                    .located(By.id("login-button"));
}
