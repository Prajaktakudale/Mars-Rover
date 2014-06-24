import java.util.*;

public class RoverManager {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String gridInput = scanner.nextLine();
        PlateauGrid grid = new PlateauGrid(Integer.parseInt(gridInput.split(" ")[0]), Integer.parseInt(gridInput.split(" ")[1]));
        while (scanner.hasNext()) {
            String startingPosition = scanner.nextLine();
            IPosition currentPosition = getPosition(startingPosition,grid);
            MarsRover marsRover = new MarsRover(currentPosition);
            String inputCommand = scanner.nextLine();
            marsRover.SetCommands(inputCommand);
            marsRover.moveRover();
            System.out.println(marsRover.GetPosition()
            );
        }
    }

    private static IPosition getPosition(String startingPosition, PlateauGrid grid) {
        String[] positionDetails = startingPosition.split(" ");
        int xCoordinate = Integer.parseInt(positionDetails[0]);
        int yCoordinate = Integer.parseInt(positionDetails[1]);
        CoordinatesOfRover coordinatesOfRover = new CoordinatesOfRover(xCoordinate,yCoordinate);
        Map map = new HashMap();
        map.put("E", new EastPosition(coordinatesOfRover,grid));
        map.put("W", new WestPosition(coordinatesOfRover,grid));
        map.put("N", new NorthPosition(coordinatesOfRover,grid));
        map.put("S", new SouthPosition(coordinatesOfRover,grid));
        return (IPosition) map.get(positionDetails[2]);
    }

}
