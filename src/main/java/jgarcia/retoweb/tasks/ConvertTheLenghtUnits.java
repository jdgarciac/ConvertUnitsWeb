package jgarcia.retoweb.tasks;

import jgarcia.retoweb.models.LenghtDataModel;
import jgarcia.retoweb.userinterface.LenghtUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class ConvertTheLenghtUnits implements Task {

    private List<LenghtDataModel> lenghtData;

    public ConvertTheLenghtUnits(List<LenghtDataModel> lenghtData) {
        this.lenghtData = lenghtData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(lenghtData.get(0).getLenght()).into(LenghtUnitsPage.LENGHT_AMOUNT),
                SelectFromOptions.byVisibleText(lenghtData.get(0).getUnit_from()).from(LenghtUnitsPage.UNIT_FROM),
                SelectFromOptions.byVisibleText(lenghtData.get(0).getUnit_to()).from(LenghtUnitsPage.UNIT_TO)
        );

    }

    public static ConvertTheLenghtUnits with(List<LenghtDataModel> lenghtData) {
        return Tasks.instrumented(ConvertTheLenghtUnits.class,lenghtData);
    }

}
