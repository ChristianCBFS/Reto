package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register {
    public static final Target TXT_FIRST_NAME = Target.the("Usuario").located(By.id("customer.firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Usuario").located(By.id("customer.lastName"));
    public static final Target TXT_ADDRESS = Target.the("Usuario").located(By.id("customer.address.street"));
    public static final Target TXT_CITY = Target.the("Usuario").located(By.id("customer.address.city"));
    public static final Target TXT_STATE = Target.the("Usuario").located(By.id("customer.address.state"));
    public static final Target TXT_ZIP_CODE = Target.the("Usuario").located(By.id("customer.address.zipCode"));
    public static final Target TXT_PHONE = Target.the("Usuario").located(By.id("customer.phoneNumber"));
    public static final Target TXT_SSN= Target.the("Usuario").located(By.id("customer.ssn"));
    public static final Target TXT_USERNAME = Target.the("Usuario").located(By.id("customer.username"));
    public static final Target TXT_PASSWORD = Target.the("Usuario").located(By.id("customer.password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Usuario").located(By.id("repeatedPassword"));
    public static final Target BTN_REGISTER_USER = Target.the("Usuario").locatedBy("//input[@value='Register']");
    public static final Target MSG_REGISTER_OK = Target.the("Usuario").locatedBy("//p[contains(text(),'{0}')]");

}
