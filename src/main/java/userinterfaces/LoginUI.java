package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class LoginUI extends PageObject {

    public static final Target TXT_USUARIO = Target.the("Usuario").locatedBy("//*[@name='username']");
    public static final Target TXT_PASSWORD = Target.the("Password").locatedBy("//*[@name='password']");
    public static final Target BTN_LOGIN = Target.the("login").locatedBy("//input[@value='Log In']");
    public static final Target LINK_REGISTER = Target.the("login").locatedBy("//a[contains(text(),'Register')]");
    public static final Target MSG_INGRESO_ERROR = Target.the("login").locatedBy("//h1[contains(text(),'{0}}')]");

}
