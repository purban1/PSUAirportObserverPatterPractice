package airportobserverpatternpractice;

public class Pilot {
    private String pilotNumber;
    private String name;
    private int age;
    private int yearsExperience;
    private Address address;

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
    
}
