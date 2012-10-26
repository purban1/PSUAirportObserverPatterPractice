package airportobserverpatternpractice;

public class FlightPlan {
    private String planName;
    private String departingFrom;
    private String departingGate;
    private String arrvalAt;
    private String arrivalGate;

    public String getDepartingFrom() {
        return departingFrom;
    }

    public void setDepartingFrom(String departingFrom) {
        // Verify the input
        this.departingFrom = departingFrom;
    }

    public String getDepartingGate() {
        return departingGate;
    }

    public void setDepartingGate(String departingGate) {
        // Verify the input
        this.departingGate = departingGate;
    }

    public String getArrvalAt() {
        return arrvalAt;
    }

    public void setArrvalAt(String arrvalAt) {
        // Verify the input
        this.arrvalAt = arrvalAt;
    }

    public String getArrivalGate() {
        return arrivalGate;
    }

    public void setArrivalGate(String arrivalGate) {
        // Verify the input
        this.arrivalGate = arrivalGate;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        // Verify the input
        this.planName = planName;
    }

    

}
