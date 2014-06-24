public class MoveForward implements ICommand {
    @Override
    public IPosition execute(IPosition roversPosition) throws Exception {
        return roversPosition.MoveForward();
    }
}
