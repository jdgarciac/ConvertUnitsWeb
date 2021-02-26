package jgarcia.retoweb.questions;

import jgarcia.retoweb.userinterface.LenghtUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheResult implements Question<Boolean> {

    private final String result;

    public TheResult(String result) {
        this.result = result;
    }

    public static TheResult isCorrect(String result) {
        return new TheResult(result);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LenghtUnitsPage.RESULTS.resolveFor(actor).getText().equalsIgnoreCase(result);
    }
}
