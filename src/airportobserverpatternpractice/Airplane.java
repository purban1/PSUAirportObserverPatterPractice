package airportobserverpatternpractice;

import java.util.*;

public class Airplane {

    private String airline;
    private String flightNumber;
    private List<FlightPlan> flightPlan = new ArrayList<FlightPlan>();
    private List<FlightPilot> pilots = new ArrayList<FlightPilot>();

    public Airplane(String airline, String flightNumber, FlightPlan flightPlan, FlightPilot pilot) {
        // Verify the inputs
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.flightPlan.add(flightPlan);
        this.pilots.add(pilot);
    }

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

    public List<FlightPlan> getFlightPlan() {
        return flightPlan;
    }

    public void setFlightPlan(FlightPlan flightPlan) {
        // Verify the input
        this.flightPlan.add(flightPlan);
    }

    public List<FlightPilot> getPilot() {
        return pilots;
    }

    public void setPilot(FlightPilot pilot) {
        // Verify the input
        this.pilots.add(pilot);
    }

    // Call this method to replace the pilot with a new Pilot
    public void updatePilot(FlightPilot pilot) {
        // Verify the input
        this.pilots.clear();
        this.pilots.add(pilot);
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
        return "Airplane{" + "airline=" + airline + ", flightNumber="
                + flightNumber + ",\n\tflightPlan=" + flightPlan + ",\n\tpilots="
                + pilots + '}';
    }
}
