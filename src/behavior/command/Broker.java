package behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> commandList;

    public Broker() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void commit() {
        for (Command c : commandList)
            c.execute();
        commandList.clear();
    }
}
