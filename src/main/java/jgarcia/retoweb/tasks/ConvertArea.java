package jgarcia.retoweb.tasks;

import jgarcia.retoweb.models.AreaDataModel;
import jgarcia.retoweb.userinterface.AreaUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class ConvertArea implements Task {

    private final List<AreaDataModel> areaData;

    public ConvertArea(List<AreaDataModel> areaData) {
        this.areaData = areaData;
    }

    public static ConvertArea with(List<AreaDataModel> areaData) {
        return Tasks.instrumented(ConvertArea.class,areaData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Scroll.to(AreaUnitsPage.AREA_AMOUNT);

        actor.attemptsTo(
                Enter.theValue(areaData.get(0).getArea()).into(AreaUnitsPage.AREA_AMOUNT),
                SelectFromOptions.byVisibleText(areaData.get(0).getUnit_from()).from(AreaUnitsPage.UNIT_FROM),
                SelectFromOptions.byVisibleText(areaData.get(0).getUnit_to()).from(AreaUnitsPage.UNIT_TO)
        );



    }
}
