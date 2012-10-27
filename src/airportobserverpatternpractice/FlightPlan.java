package airportobserverpatternpractice;

import java.util.Objects;

public class FlightPlan {
    private String planName;
    private String departingFrom;
    private String departingGate;
    private String arrvalAt;
    private String arrivalGate;
    
    public FlightPlan(String planName, String departingFrom, String departingGate,
            String arrvalAt, String arrivalGate) {
        this.planName = planName;
        this.departingFrom = departingFrom;
        this.departingGate = departingGate;
        this.arrvalAt = arrvalAt;
        this.arrivalGate = arrivalGate;
    }
    
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

        @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.planName);
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
        final FlightPlan other = (FlightPlan) obj;
        if (!Objects.equals(this.planName, other.planName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FlightPlan{" + "planName=" + planName + ", departingFrom=" + departingFrom + 
                ", departingGate=" + departingGate + ", arrvalAt=" + arrvalAt + 
                ", arrivalGate=" + arrivalGate + '}';
    }


}
