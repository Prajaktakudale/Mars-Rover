public interface IPosition {
    IPosition TurnLeft();
    IPosition TurnRight();
    IPosition MoveForward() throws Exception;

    String GetCurrentPosition();
}