package jgarcia.retoweb.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jgarcia.retoweb.models.AreaDataModel;
import jgarcia.retoweb.questions.TheAreaResult;
import jgarcia.retoweb.tasks.ConvertArea;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConvertAreaStepDefinitions {

    @Before
    public void InitialSetUp(){
        setTheStage(new OnlineCast());
    }

    @When("^he introduces the data to change the area unit$")
    public void heIntroducesTheDataToChangeTheAreaUnit(List<AreaDataModel> areaData) {
        theActorCalled("User").attemptsTo(

                ConvertArea.with(areaData)
        );

    }

    @Then("^he validates the area unit \"([^\"]*)\"$")
    public void heValidatesTheAreaUnit(String areaResult) {

        theActorInTheSpotlight().should(seeThat(TheAreaResult.isCorrect(areaResult)));

    }
}
