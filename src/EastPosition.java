
public class EastPosition implements IPosition {

    CoordinatesOfRover _coordinatesOfRover;
    PlateauGrid _grid;

    public EastPosition(CoordinatesOfRover coordinatesOfRover, PlateauGrid grid) {
        _coordinatesOfRover = coordinatesOfRover;
        _grid = grid;
    }

    @Override
    public IPosition TurnLeft() {
        return new NorthPosition(_coordinatesOfRover, _grid);
    }

    @Override
    public IPosition TurnRight() {
        return new SouthPosition(_coordinatesOfRover, _grid);
    }

    @Override
    public IPosition MoveForward() throws Exception {
        _coordinatesOfRover.IncrementXCoordinate(_grid);
        return this;
    }

    @Override
    public String GetCurrentPosition() {
        return _coordinatesOfRover.getX() + " " + _coordinatesOfRover.getY() + " " + "East";

    }
}
