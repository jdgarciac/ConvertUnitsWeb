package jgarcia.retoweb.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jgarcia.retoweb.models.VelocityDataModel;
import jgarcia.retoweb.questions.TheResult;
import jgarcia.retoweb.questions.TheVelocityResult;
import jgarcia.retoweb.tasks.ConvertVelocityUnits;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConvertVelocityUnitsStepDefinitions {

    @Before
    public void InitialSetUp(){
        setTheStage(new OnlineCast());
    }


    @When("^he introduces the data to change the velocity unit$")
    public void heIntroducesTheDataToChangeTheVelocityUnit(List<VelocityDataModel> velocityData) {
        OnStage.theActorCalled("User").attemptsTo(
               ConvertVelocityUnits.with(velocityData)
        );

    }

    @Then("^he validates the velocity unit \"([^\"]*)\"$")
    public void heValidatesTheVelocityUnit(String velocityResult) {
        theActorInTheSpotlight().should(seeThat(TheVelocityResult.isCorrect(velocityResult)));
    }

}
