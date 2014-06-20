public class RoversPosition {
    public Point point;
    public Direction direction;

    public RoversPosition(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case EAST:
                direction = Direction.SOUTH;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case NORTH:
                direction = Direction.EAST;
                break;
        }
    }

    public void move() {
        switch (direction) {
            case EAST:
                point = new Point(point.getX() + 1, point.getY());
                break;
            case WEST:
                point = new Point(point.getX() - 1, point.getY());
                break;
            case NORTH:
                point = new Point(point.getX(), point.getY() + 1);
                break;
            case SOUTH:
                point = new Point(point.getX(), point.getY() - 1);
                break;
        }
    }
}