package mediator;

public class TurnOfAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOfAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
