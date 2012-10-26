package airportobserverpatternpractice;

import java.util.Map;
import java.util.Set;

/**
 * 
 * @author jlombardo
 */
public class ConsoleOutputObserver implements Observer {

    private final String OUTPUT = "Console";
    
    @Override
    public void update(String msg, Map<String, Object> data) {
        System.out.println(msg);
        Set<String> keys = data.keySet();
        for(String key : keys) {
            System.out.println("\t" + key + " = " + data.get(key).toString());
        }
    }
    
    public String getTypeOfOutput(){
        return OUTPUT;
    }
    
}
