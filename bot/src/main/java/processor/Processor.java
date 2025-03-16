package processor;

import database.Database;
import java.util.HashMap;
import java.util.Map;
import processor.methods.Default;
import processor.methods.Help;
import processor.methods.List;
import processor.methods.Start;
import processor.methods.Track;
import processor.methods.Untrack;

public class Processor {

    static final Map<String, MethodProcessor> roads = createRoadsMap();

    private static Map<String, MethodProcessor> createRoadsMap() {
        Map<String, MethodProcessor> map = new HashMap<>();
        map.put("/start", new Start());
        map.put("/help", new Help());
        map.put("/track", new Track());
        map.put("/untrack", new Untrack());
        map.put("/list", new List());
        return map;
    }

    private Processor() {
    }

    public static String getAnswer(String text, Long chatId, Database database) {
        String[] separated = separator(text);
        MethodProcessor answer = roads.getOrDefault(separated[0], new Default());
        return answer.get(separated, chatId, database);
    }

    private static String[] separator(String command) {
        return command.split(" ");
    }
}
