package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ElementoEsVisible;
import tasks.RealizarLogin;
import tasks.RealizarRegistro;
import userinterfaces.LoginUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static userinterfaces.LoginUI.LINK_REGISTER;
import static userinterfaces.LoginUI.MSG_INGRESO_ERROR;
import static userinterfaces.Register.BTN_REGISTER_USER;
import static userinterfaces.Register.MSG_REGISTER_OK;

public class SesionDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Nati");
    private LoginUI login = new LoginUI();

    @Given("^la url es valida$")
    public void laUrlEsValida() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(login));
    }


    @When("^el usuario ingresa (.*), (.*)$")
    public void elUsuarioIngresa(String usuario, String password) {
        actor.wasAbleTo(
                RealizarLogin.conDatos(usuario,password)
        );
    }

    @When("^el usuario da click en SIGN IN$")
    public void elUsuarioDaClickEnSIGNIN() {
        actor.attemptsTo(
                Click.on(LoginUI.BTN_LOGIN)
        );
    }


    @When("^el usuario inicia el registro con sus datos (.*), (.*),(.*), (.*),(.*), (.*),(.*), (.*),(.*), (.*),(.*)$")
    public void elUsuarioIniciaElRegistroConSusDatos(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String pass, String confirmPass) {
        actor.attemptsTo(
                RealizarRegistro.conDatos(firstName, lastName, address, city, state, zipCode, phone, ssn, username, pass, confirmPass)
        );
    }

    @And("^el usuario selecciona Register$")
    public void elUsuarioSeleccionaRegister() {
        actor.attemptsTo(
                Click.on(LINK_REGISTER)
        );

    }

    @And("^el usuario confirma el registro$")
    public void elUsuarioConfirmaElRegistro() {
        actor.attemptsTo(
                Click.on(BTN_REGISTER_USER)
        );
    }


    @Then("^Se muestra el mensaje (.*)$")
    public void seMuestraElMensaje(String mensaje) {
        actor.should(
                seeThat("mensaje   ", ElementoEsVisible.visible(MSG_REGISTER_OK.of(mensaje)) ,is(true))
        );
    }

    @And("^el usuario selecciona Login$")
    public void elUsuarioSeleccionaLogin() {
    }

    @Then("^Se muestra en login el mensaje (.*)$")
    public void seMuestraEnLoginElMensaje(String mensaje) {
        actor.should(
                seeThat("mensaje  ", ElementoEsVisible.visible(MSG_INGRESO_ERROR.of(mensaje)) ,is(true))
        );
    }
}
