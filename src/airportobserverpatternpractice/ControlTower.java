package airportobserverpatternpractice;

import java.util.*;

public class ControlTower implements Subject {

    private List<Airplane> planes;
    private List<Observer> observers;

    public ControlTower() {
        planes = new ArrayList<Airplane>();
        observers = new ArrayList<Observer>();
    }

  
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
    public void displayFlightItenoraryForTheAirport() {
        // Verify that the planes list and Observer lists are not null
        
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

    // Remove a flight from the Iteneratory of the Airport and sent to  
    // notifyObervers that the Airplane service is gone
    public void removeFlightFromItenerary(Airplane plane){
        // Verify the input
        if (planes.contains(plane)){
            int index = planes.indexOf(plane);
            Map data = new HashMap<String, Object>();
            data.put("The following flight has been cancelled", plane);
            planes.remove(index);
            this.notifyObservers("Update to flight availability...", data);
        }
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

    public void setPlanes(Airplane planes) {
        // Verify the input
        this.planes.add(planes);
    }
    
    // Call this method when a new flight added.
    public void addAdditionalFlight(Airplane plane){
        // Verify the input
        this.planes.add(plane);
        Map data = new HashMap<String, Object>();
        data.put("New Flight added...", plane);
        this.notifyObservers("Breaking news:", data);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Observer observer) {
        // Verify the input
        this.observers.add(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
}
