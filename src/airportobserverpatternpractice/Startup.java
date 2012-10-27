package airportobserverpatternpractice;

public class Startup {

   public static void main(String[] args) throws InterruptedException {
       // Create 8 Address Objects, 1 for each Pilot
       Address a1 = new Address("2468 Elk Wood Drive", "Delafield", "WI", "53069");
       Address a2 = new Address("1357 Soft Feather Road", "Waukesha", "WI", "53444");
       Address a3 = new Address("8462 Somewhere Ave", "Delafield", "WI", "53555");
       Address a4 = new Address("7531 Tree Bark Ave", "Milwaukee", "WI", "53666");
       Address a5 = new Address("9621 Green Grass Lane", "Milwaukee", "WI", "53777");
       Address a6 = new Address("5487 Red Rudy Road", "Pewaukee", "WI", "53888");
       Address a7 = new Address("2587 Hot Potato Drive", "Knucklehead", "WI", "53889");
       Address a8 = new Address("9517 North East Stree", "Confusion", "WI", "53999");
       
       // Create 8 people for the Pilot CoPilot positions
       Pilot p1 = new Pilot("P001", "Joe Blow", 45, 12, a1);
       Pilot p2 = new Pilot("P002", "Jane Doe", 41, 9, a2);
       Pilot p3 = new Pilot("P003", "John Doe", 47, 15, a3);
       Pilot p4 = new Pilot("P004", "Greg Greggory", 48, 16, a4);
       Pilot p5 = new Pilot("P005", "Mary Goround", 53, 18, a5);
       Pilot p6 = new Pilot("P006", "Jack Candlestick", 51, 7, a6);
       Pilot p7 = new Pilot("P007", "Lilly Merril", 41, 11, a7);
       Pilot p8 = new Pilot("P008", "Chris Cross", 42, 9, a8);
       
       // Populate the FlightPilot positions so that the planes can be flown :)
       FlightPilot fp1 = new FlightPilot(p1, p5);
       FlightPilot fp2 = new FlightPilot(p2, p6);
       FlightPilot fp3 = new FlightPilot(p3, p7);
       FlightPilot fp4 = new FlightPilot(p4, p8);
       
       // Create the flight plans
       FlightPlan milwToAtlanta = new FlightPlan("MilwAtlanta", "Milwaukee", "M05", "Atlanta", "A05");
       FlightPlan atlantaToMilw = new FlightPlan("AtlantaMilw", "Atlanta", "A05", "Milwaukee", "M05");
       FlightPlan ohareToLa = new FlightPlan("OhareLA", "O'Hare", "O06", "Los Angeles", "L06");
       FlightPlan laToOhare = new FlightPlan("laOhare", "Los Angeles", "L06", "O'Hare", "L06");
       
       // Setup the Airplanes
       Airplane plane1 = new Airplane("American", "222", milwToAtlanta, fp1);
       Airplane plane2 = new Airplane("American", "333", atlantaToMilw, fp1);
       Airplane plane3 = new Airplane("Delta", "555", ohareToLa, fp2);
       Airplane plane4 = new Airplane("Delta", "777", laToOhare, fp2);
       
       // Create Observer for the ControlTower
       ConsoleOutputObserver console = new ConsoleOutputObserver();
       
       // Create the control tower and assign the Observer
       ControlTower ct1 = new ControlTower();
       ct1.setObservers(console);
       
       ct1.setPlanes(plane1);
       ct1.setPlanes(plane2);
       ct1.setPlanes(plane3);
       
       ct1.displayFlightItenoraryForTheAirport();
       
       Thread.sleep(3500); // not required, just slow things down --> 1000 ms = 1 second
       
       //Remove a Flight
       ct1.removeFlightFromItenerary(plane3);
       
       Thread.sleep(3500); // not required, just slow things down --> 1000 ms = 1 second
       //Update pilot information for plane 1 and have the updated information sent
       plane1.updatePilot(fp4);
       ct1.updateAirplane(plane1);
       
       Thread.sleep(3500); // not required, just slow things down --> 1000 ms = 1 second
       // Add a flight
       ct1.addAdditionalFlight(plane4);
       
    }

   
}
