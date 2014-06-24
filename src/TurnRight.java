public class TurnRight implements ICommand {
    @Override
    public IPosition execute(IPosition roversPosition) {
         return roversPosition.TurnRight();
    }
}
