public class CoordinatesOfRover {
    private int x,y;
    public CoordinatesOfRover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    public void IncrementYCoordinate(PlateauGrid _grid) throws Exception {
        if(_grid.height == y){
            System.out.println("Rover is moving out of the plateau.");
            throw new Exception();
        }
        y++;
    }

    public void IncrementXCoordinate(PlateauGrid _grid) throws Exception{
        if(_grid.height == x){
            System.out.println("Rover is moving out of the plateau.");
            throw new Exception();
        }
        x++;
    }

    public void DecrementYCoordinate(PlateauGrid _grid) throws Exception {
        if(y == 0){
            System.out.println("Rover is moving out of the plateau.");
            throw new Exception();
        }
        y--;
    }

    public void DecrementXCoordinate(PlateauGrid _grid) throws Exception {
        if(x == 0){
            System.out.println("Rover is moving out of the plateau.");
            throw new Exception();
        }
        x--;
    }
}
