package jgarcia.retoweb.questions;

import jgarcia.retoweb.userinterface.AreaUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheAreaResult implements Question<Boolean> {

    private final String areaResult;

    public TheAreaResult(String areaResult) {
        this.areaResult = areaResult;
    }


    public static TheAreaResult isCorrect(String areaResult) {
        return new TheAreaResult(areaResult);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return AreaUnitsPage.RESULTS.resolveFor(actor).getText().equalsIgnoreCase(areaResult);
    }
}
