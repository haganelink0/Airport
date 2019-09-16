
public class Plane {
    private String name;
    private int passengers;

    public Plane(String name, int passengers) {
        this.name = name;
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return name + " (" + passengers + " ppl)";
    }
    
    
}
