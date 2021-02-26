package jgarcia.retoweb.tasks;

import jgarcia.retoweb.models.VelocityDataModel;
import jgarcia.retoweb.userinterface.LenghtUnitsPage;
import jgarcia.retoweb.userinterface.VelocityUnitsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static jgarcia.retoweb.userinterface.VelocityUnitsPage.VELOCITY_AMOUNT;

public class ConvertVelocityUnits implements Task {

    private List<VelocityDataModel> velocityData;

    public ConvertVelocityUnits(List<VelocityDataModel> velocityData) {
        this.velocityData = velocityData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Scroll.to(VELOCITY_AMOUNT);
        actor.attemptsTo(

                Enter.theValue(velocityData.get(0).getVelocity()).into(VELOCITY_AMOUNT),
                SelectFromOptions.byVisibleText(velocityData.get(0).getUnit_from()).from(VelocityUnitsPage.UNIT_FROM),
                SelectFromOptions.byVisibleText(velocityData.get(0).getUnit_to()).from(VelocityUnitsPage.UNIT_TO)
        );
    }

    public static ConvertVelocityUnits with(List<VelocityDataModel> velocityData) {
        return Tasks.instrumented(ConvertVelocityUnits.class,velocityData);
    }
}
