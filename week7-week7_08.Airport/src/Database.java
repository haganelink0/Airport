import java.util.HashMap;
import java.util.Map;

public class Database {
    private HashMap<String, Plane> planes;
    private HashMap<String, Plane> flights;

    public Database() {
        this.planes = new HashMap<String, Plane>();
        this.flights = new HashMap<String, Plane>();
    }

    public HashMap<String, Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(HashMap<String, Plane> planes) {
        this.planes = planes;
    }

    public HashMap<String, Plane> getFlights() {
        return flights;
    }

    public void setFlights(HashMap<String, Plane> flights) {
        this.flights = flights;
    }
    
    public void addPlane(String name, int cap) {
        Plane first = new Plane(name, cap);
        planes.put(name, first);
    }
    
    public void addFlight(String plane, String flight) {
        Plane first = planes.get(plane);
        
        flights.put(flight, first);
    }
    
    public Plane getSinglePlane(String name) {
        return planes.get(name);
    }
    
    public void printPlanes() {
       for (String name : planes.keySet()) {
           System.out.println(planes.get(name));
            
        }
    }
    
    public void printFlights() {
        for (String flight : flights.keySet()) {
            String planeId2 = flights.get(flight).toString();
            String fligh2t = flight;
            System.out.println(planeId2 + " " + fligh2t);
            
        }
    }
    
    
    
}
