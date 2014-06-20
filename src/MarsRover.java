public class MarsRover {
    RoversPosition roversPosition;

    public MarsRover(RoversPosition roversPosition) {
        this.roversPosition = roversPosition;
    }

    public void turnLeft() {
        roversPosition.turnLeft();
    }

    public void turnRight() {
        roversPosition.turnRight();
    }

    public void move() {
       roversPosition.move();
    }

    public int getX() {
        return roversPosition.point.getX();
    }

    public int getY() {
        return roversPosition.point.getY();
    }
}
