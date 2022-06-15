package choucair.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static choucair.utils.enums.ResetService.BASE_URL;
public class BeforeHooks {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
