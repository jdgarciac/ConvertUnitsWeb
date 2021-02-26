package jgarcia.retoweb.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jgarcia.retoweb.models.LenghtDataModel;
import jgarcia.retoweb.questions.TheResult;
import jgarcia.retoweb.tasks.ConvertTheLenghtUnits;
import jgarcia.retoweb.tasks.OpenTheWebSite;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConvertLenghtUnitsStepDefinitions {

    @Before
    public void InitialSetUp(){
        setTheStage(new OnlineCast());
    }


    @Given("^that user opens Convertworld page$")
    public void thatUserOpensConvertworldPage() {
        theActorCalled("User").wasAbleTo(OpenTheWebSite.ConvertWorld());

    }


    @When("^he introduces the data to make calculations$")
    public void heIntroducesTheDataToMakeCalculations(List<LenghtDataModel> lenghtData) {
        theActorInTheSpotlight().attemptsTo(
                ConvertTheLenghtUnits.with(lenghtData)
        );
    }

    @Then("^he validates the \"([^\"]*)\"$")
    public void heValidatesThe(String result) {
        theActorInTheSpotlight().should(seeThat(TheResult.isCorrect(result)));
    }
}
