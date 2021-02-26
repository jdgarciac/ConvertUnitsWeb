package jgarcia.retoweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VelocityUnitsPage {

    public final static Target VELOCITY_AMOUNT = Target.the("Velocity field").
            located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/form[1]/input[1]"));

    public final static Target UNIT_FROM = Target.the("Unit from").
            located(By.xpath("//select[@id='from_speed']"));

    public final static Target UNIT_TO = Target.the("Unit to").
            located(By.xpath("//select[@id='to_speed']"));

    public final static Target RESULTS = Target.the("Results").
            located(By.xpath("//div[@id='div_speed']"));

}
