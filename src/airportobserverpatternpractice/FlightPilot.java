package airportobserverpatternpractice;

import java.util.Objects;

public class FlightPilot {
    private Pilot pilot;
    private Pilot coPilot;

    public FlightPilot(Pilot pilot, Pilot coPilot) {
        this.pilot = pilot;
        this.coPilot = coPilot;
    }

   
    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        // Verify the input
        this.pilot = pilot;
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(Pilot coPilot) {
        // Verify the input
        this.coPilot = coPilot;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.pilot);
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
        final FlightPilot other = (FlightPilot) obj;
        if (!Objects.equals(this.pilot, other.pilot)) {
            return false;
        }
        return true;
    }
   
    
    @Override
    public String toString() {
        return "FlightPilot{" + "pilot=" + pilot + ", \n\tcoPilot=" + coPilot + '}';
    }
    
}
