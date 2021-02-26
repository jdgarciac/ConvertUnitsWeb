package jgarcia.retoweb.tasks;

import jgarcia.retoweb.userinterface.ConvertWorldURL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheWebSite implements Task {

    private ConvertWorldURL convertWorldURL;

    public static OpenTheWebSite ConvertWorld() {
        return Tasks.instrumented(OpenTheWebSite.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(convertWorldURL));

    }
}
