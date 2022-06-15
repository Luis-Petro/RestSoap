package choucair.stepdefinitions;

import choucair.questions.LastResponseStatusCode;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import choucair.model.ModelCreateUserRest;
import choucair.tasks.CreateUserRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static choucair.utils.Constant.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static choucair.utils.enums.ResetService.BASE_URL;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
        theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString())); }

    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRest) {
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRest));
    }


    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
