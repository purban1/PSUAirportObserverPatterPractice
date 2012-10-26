package airportobserverpatternpractice;

import java.util.Objects;

public class Address {

    private String address;
    private String city;
    private String state;
    private String postalCode;

    public Address(String address, String city, String state, String postalCode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void setAddress(String address) {
        // Verify the input
        this.address = address;
    }

    /**
     * @return Returns the address1.
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return Returns the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city to set.
     */
    public void setCity(String city) {
        // Verify the input
        this.city = city;
    }

    /**
     * @return Returns the postalCode.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode The postalCode to set.
     */
    public void setPostalCode(String postalCode) {
        // Verify the input
        this.postalCode = postalCode;
    }

    /**
     * @return Returns the state.
     */
    public String getState() {
        return state;
    }

    /**
     * @param state The state to set.
     */
    public void setState(String state) {
        // Verify the input
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.address);
        hash = 23 * hash + Objects.hashCode(this.city);
        hash = 23 * hash + Objects.hashCode(this.state);
        hash = 23 * hash + Objects.hashCode(this.postalCode);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.postalCode, other.postalCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{" + "address=" + address + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + '}';
    }
}
