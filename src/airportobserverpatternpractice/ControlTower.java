package airportobserverpatternpractice;

import java.util.*;

public class ControlTower implements Subject {

    private List<Airplane> planes;
    private List<Observer> observers;

    
    // This method is called when you want to update the information about
    // a particular plane
    public void updateAirplane(Airplane a) {
        // Verify the input
        if (planes.contains(a)) {
            // Get the index of the plane object to be updated
            int index = planes.indexOf(a);
            // Update the Airplane information
            planes.set(index, a);
            // Create a new map to store the information change about this 
            // updated airplane for the notify method
            Map data = new HashMap<String, Airplane>();
            data.put("Updated flight information...", a);
            notifyObservers("New info for this flight:", data);
        }
    }

    // This method is called when you want to display the information about
    // all of the flights
    public void displayFlightItenoraryForTheAirpot() {
        // First we need a new map to pass to notifyObservers.
        // The map key should be the airplane flightNumber and then the plane 
        // object.
        Map data = new HashMap<String, Airplane>();
        // Populate the map with the Airplane's unique Flight Number and the 
        // plane object
        for (Airplane a : planes){
            data.put(a.getFlightNumber(), a);
        }
        notifyObservers("Todays flight are:", data);
    }

    
    @Override
    public void removeObserver(Observer observer) {
        // Verify the input
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg, Map<String, Object> data) {
        for (Observer o : observers) {
            o.update(msg, data);
        }
    }

    public List<Airplane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Airplane> planes) {
        // Verify the input
        this.planes = planes;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        // Verify the input
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
}
