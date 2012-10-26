package airportobserverpatternpractice;

import java.util.Map;

/**
 * The general contract for Observer (subscriber or listener) implementations
 * of the Observer Pattern.
 * 
 * @author jlombardo
 */
public interface Observer {
    public abstract void update(String msg, Map<String, Object> data);
}
