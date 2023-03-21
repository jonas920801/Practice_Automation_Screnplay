package com.jonathan.stepdefinitions;

import com.jonathan.interactions.Abrir;
import com.jonathan.questions.AutenticacionEcommerce;
import com.jonathan.tasks.Autenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSaucedemoStepDefinition {

    @Dado("que {word} se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @Cuando("ingresa las credenciales")
    public void elUsuarioIngreseSusCredenciales() {
       theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
   }

    @Entonces("el usuario deberia ingresar a la pagina de {word}")
    public void elUsuarioDeberiaIngresarAlEcommerce(String nombrePagina) {
      theActorInTheSpotlight().should(seeThat(AutenticacionEcommerce.esExitosa(nombrePagina)));
   }
}
