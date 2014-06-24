public class TurnLeft implements ICommand {
    @Override
    public IPosition execute(IPosition roversPosition) { return roversPosition.TurnLeft(); }
}
