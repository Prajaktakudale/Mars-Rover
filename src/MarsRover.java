import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {
    
    IPosition roversPosition;
    List<ICommand> _commands;

    public MarsRover(IPosition currentPosition) {
        _commands = new ArrayList<ICommand>();
        roversPosition = currentPosition;
    }

    public void SetCommands(String inputCommand) {
        Map<String, ICommand> commandMapper = new HashMap<String, ICommand>();
        commandMapper.put("L",new TurnLeft());
        commandMapper.put("R",new TurnRight());
        commandMapper.put("M",new MoveForward());
        String[] commands = inputCommand.split("");
        for (String command : commands) {
            _commands.add(commandMapper.get(command));
        }
    }

    public void moveRover() throws Exception {
        for (ICommand command : _commands) {
            roversPosition = command.execute(roversPosition);
        }
    }

    public String GetPosition() {
        return roversPosition.GetCurrentPosition();
    }
}
