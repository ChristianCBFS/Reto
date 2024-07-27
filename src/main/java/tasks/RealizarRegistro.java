package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Register;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarRegistro implements Task {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String ssn;
    private String username;
    private String pass;
    private String confirmPass;


    public RealizarRegistro(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String pass, String confirmPass) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
        this.phone=phone;
        this.ssn=ssn;
        this.username=username;
        this.pass=pass;
        this.confirmPass=confirmPass;
    }

    @Override
    public <T extends Actor> void performAs(T actor ) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(Register.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(Register.TXT_LAST_NAME),
                Enter.theValue(address).into(Register.TXT_ADDRESS),
                Enter.theValue(city).into(Register.TXT_CITY),
                Enter.theValue(state).into(Register.TXT_STATE),
                Enter.theValue(zipCode).into(Register.TXT_ZIP_CODE),
                Enter.theValue(phone).into(Register.TXT_PHONE),
                Enter.theValue(ssn).into(Register.TXT_SSN),
                Enter.theValue(username).into(Register.TXT_USERNAME),
                Enter.theValue(pass).into(Register.TXT_PASSWORD),
                Enter.theValue(confirmPass).into(Register.TXT_CONFIRM_PASSWORD)

        );

    }

    public static RealizarRegistro conDatos(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String pass, String confirmPass){
        return instrumented(RealizarRegistro.class,firstName, lastName, address, city, state, zipCode, phone, ssn, username, pass, confirmPass);
    }

}
