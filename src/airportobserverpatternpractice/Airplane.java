package airportobserverpatternpractice;

import java.util.*;

public class Airplane {
 
    private String airline;
    private String flightNumber;
    private Map<String, FlightPlan> flightPlan;
    private Map<String, FlightPilot> pilot;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        // Verify the input
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        // Verify the input
        this.airline = airline;
    }

    public Map<String, FlightPlan> getFlightPlan() {
        return flightPlan;
    }

    public void setFlightPlan(Map<String, FlightPlan> flightPlan) {
        // Verify the input
        this.flightPlan = flightPlan;
    }

    public Map<String, FlightPilot> getPilot() {
        return pilot;
    }

    public void setPilot(Map<String, FlightPilot> pilot) {
        // Verify the input
        this.pilot = pilot;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.flightNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Airplane other = (Airplane) obj;
        if (!Objects.equals(this.flightNumber, other.flightNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Airplane{" + "airline=" + airline + ": FlightNumber " + flightNumber + ", flying:\n" + flightPlan + "\n. Your Pilots are:\n" + pilot + '}';
    }
    
    
    
    
}
