package jgarcia.retoweb.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LenghtUnitsPage {

    public final static Target LENGHT_AMOUNT = Target.the("Amount field").
            located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[1]"));

    public final static Target UNIT_FROM = Target.the("Unit from").
            located(By.xpath("//select[@id='from_length']"));

    public final static Target UNIT_TO = Target.the("Unit to").
            located(By.xpath("//select[@id='to_length']"));

    public final static Target RESULTS = Target.the("Results").
            located(By.xpath("//div[@id='div_length']"));

}
