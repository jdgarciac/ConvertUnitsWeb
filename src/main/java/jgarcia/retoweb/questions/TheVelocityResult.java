package jgarcia.retoweb.questions;

import jgarcia.retoweb.userinterface.VelocityUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheVelocityResult implements Question<Boolean> {

    private final String velocityResult;

    public TheVelocityResult(String velocityResult) {
        this.velocityResult = velocityResult;
    }

    public static TheVelocityResult isCorrect(String velocityResult) {
        return new TheVelocityResult(velocityResult);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VelocityUnitsPage.RESULTS.resolveFor(actor).getText().equalsIgnoreCase(velocityResult);
    }
}
