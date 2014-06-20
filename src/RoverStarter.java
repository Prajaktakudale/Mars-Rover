import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoverStarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gridInput = scanner.nextLine();
        Grid grid = new Grid(Integer.parseInt(gridInput.split(" ")[0]), Integer.parseInt(gridInput.split(" ")[1]));
        while (scanner.hasNext()) {

            String startingPosition = scanner.nextLine();
            String[] split = startingPosition.split(" ");
            RoversPosition roversPosition = new RoversPosition(
                    new Point(Integer.parseInt(split[0]),Integer.parseInt(split[1])),
                    getDirection(split[2])
            );

            MarsRover marsRover = new MarsRover(roversPosition);
            String commad = scanner.nextLine();
            String[] cmd = commad.split("");

            for (String s : cmd) {
                if(s.equals("L")) marsRover.turnLeft();
                if(s.equals("R")) marsRover.turnRight();
                if(s.equals("M")) marsRover.move();
            }

            System.out.println(marsRover.getX() + " " +
                               marsRover.getY() + " " +
                               marsRover.roversPosition.direction
            );
        }
    }

    private static Direction getDirection(String direction) {
        Map map = new HashMap();
        map.put("E",Direction.EAST);
        map.put("W",Direction.WEST);
        map.put("N",Direction.NORTH);
        map.put("S",Direction.SOUTH);
        return (Direction) map.get(direction);
    }
}
