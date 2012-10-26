package airportobserverpatternpractice;

public class FlightPilot {
    private Pilot pilot;
    private Pilot coPilot;

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
}
