
public class WestPosition implements IPosition {

    CoordinatesOfRover _coordinatesOfRover;
    PlateauGrid _grid;

    public WestPosition(CoordinatesOfRover coordinatesOfRover, PlateauGrid grid) {
        _coordinatesOfRover = coordinatesOfRover;
        _grid = grid;
    }

    @Override
    public IPosition TurnLeft() {
         return new SouthPosition(_coordinatesOfRover, _grid);
    }

    @Override
    public IPosition TurnRight() {
        return new NorthPosition(_coordinatesOfRover, _grid);
    }

    @Override
    public IPosition MoveForward() throws Exception {
        _coordinatesOfRover.DecrementXCoordinate(_grid);
        return this;
    }

    @Override
    public String GetCurrentPosition() {
        return _coordinatesOfRover.getX() + " " + _coordinatesOfRover.getY() + " " + "West";
    }
}
