
public class SouthPosition implements IPosition {

    CoordinatesOfRover _coordinatesOfRover;
    PlateauGrid _grid;

    public SouthPosition(CoordinatesOfRover coordinatesOfRover, PlateauGrid grid) {
        _coordinatesOfRover = coordinatesOfRover;
        _grid = grid;
    }

    @Override
    public IPosition TurnLeft() {
        return new EastPosition(_coordinatesOfRover, _grid);
    }

    @Override
    public IPosition TurnRight() {
        return new WestPosition(_coordinatesOfRover, _grid);
    }

    @Override
    public IPosition MoveForward() throws Exception {
        _coordinatesOfRover.DecrementYCoordinate(_grid);
        return this;
    }

    @Override
    public String GetCurrentPosition() {
        return _coordinatesOfRover.getX() + " " + _coordinatesOfRover.getY() + " " + "South";

    }
}
