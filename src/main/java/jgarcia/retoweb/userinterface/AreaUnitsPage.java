package jgarcia.retoweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AreaUnitsPage {

    public final static Target AREA_AMOUNT = Target.the("Velocity field").
            located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/form[1]/input[1]"));

    public final static Target UNIT_FROM = Target.the("Unit from").
            located(By.xpath("//select[@id='from_area']"));

    public final static Target UNIT_TO = Target.the("Unit to").
            located(By.xpath("//select[@id='to_area']"));

    public final static Target RESULTS = Target.the("Results").
            located(By.xpath("//div[@id='div_area']"));

}
