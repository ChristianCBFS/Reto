package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoEsVisible {
        public static Question<Boolean> visible(Target target) {
            return Visibility.of(target).asBoolean();
        }
}


