package airportobserverpatternpractice;

import java.util.Map;

/**
 * The general contract for Subject implementations of the Observer Pattern.
 * 
 * @author jlombardo
 */
public interface Subject {
    public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyObservers(String msg, Map<String, Object> data);
}
