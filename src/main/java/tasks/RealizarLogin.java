package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarLogin implements Task {

    private String email;
    private String password;

    public RealizarLogin (String email, String password) {
        this.email=email;
        this.password=password;

    }

    @Override
    public <T extends Actor> void performAs(T actor ) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginUI.TXT_USUARIO),
                Enter.theValue(password).into(LoginUI.TXT_PASSWORD)
        );

    }

    public static RealizarLogin conDatos(String email, String password){
        return instrumented(RealizarLogin.class,email,password);
    }

}
