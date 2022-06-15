package choucair.tasks;

import choucair.interactions.ConsumeService;
import choucair.model.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateUserRest implements Task {
    private List<ModelCreateUserRest> modelCreateUserRest;

    public CreateUserRest(List<ModelCreateUserRest> modelCreateUserRest) {
        this.modelCreateUserRest = modelCreateUserRest;
    }
    public static CreateUserRest with(List<ModelCreateUserRest> modelCreateUserRest) {
        return Tasks.instrumented(CreateUserRest.class, modelCreateUserRest);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateUserRest.get(0).toString()));

    }
}
