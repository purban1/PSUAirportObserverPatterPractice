package airportobserverpatternpractice;

import java.util.Objects;

public class Pilot {
    private String pilotNumber;
    private String name;
    private int age;
    private int yearsExperience;
    private Address address;

    public Pilot(String pilotNumber, String name, int age, int yearsExperience, Address address) {
        this.pilotNumber = pilotNumber;
        this.name = name;
        this.age = age;
        this.yearsExperience = yearsExperience;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Verify the input
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Verify the input
        this.age = age;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        // Verify the input
        this.yearsExperience = yearsExperience;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        // Verify the input
        this.address = address;
    }

    public String getPilotNumber() {
        return pilotNumber;
    }

    public void setPilotNumber(String pilotNumber) {
        // Verify the input
        this.pilotNumber = pilotNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.pilotNumber);
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
        final Pilot other = (Pilot) obj;
        if (!Objects.equals(this.pilotNumber, other.pilotNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pilot{" + "pilotNumber=" + pilotNumber + ", name=" + name + 
                ", age=" + age + ", yearsExperience=" + yearsExperience + '}';
    }
    
    
    
}
