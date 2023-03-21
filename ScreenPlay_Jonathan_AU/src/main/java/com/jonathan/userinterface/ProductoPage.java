package com.jonathan.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductoPage extends PageObject {

    public static final Target LABEL_TITULO_PAGINA = the("Titulo de la Pagina Products").located(By.xpath("//span[contains(.,'Products')]"));

    public static final Target BOTON_PRODUCTO_COMPRAR =
            the("Boton para adicionar el producto seleccionado al carrito")
                    .locatedBy("//a[contains(.,'{0}')]/../following-sibling::div//button");

    public static final Target BOTON_CARRITO =
            the("Boton de carrito").located(By.className("shopping_cart_link"));

}
