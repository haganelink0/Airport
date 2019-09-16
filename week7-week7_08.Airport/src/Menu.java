import java.util.Scanner;

public class Menu {
    private Scanner reader;
    private Database database;

    public Menu(Scanner reader) {
        this.reader = reader;
        this.database = new Database();
    }
    
    public void Start() {
        System.out.println("Airport panel\n" +
            "--------------------\n" +
            "\n");
        while (true) {
            System.out.println(
            "Choose operation:\n" +
            "[1] Add airplane\n" +
            "[2] Add flight\n" +
            "[x] Exit");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            }
            else if (command.equals("1")) {
                addAirplane();
            }
            else if (command.equals("2")) {
                addFlight();
            }
        }
        System.out.println("Flight service\n" +
                "------------\n"
        + "\n");
        while (true) {
            System.out.println(
            "Choose operation:\n" +
            "[1] Print planes\n" +
            "[2] Print flights\n" +
            "[3] Print plane info\n" +
            "[x] Quit");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            }
            else if (command.equals("1")) {
                printPlanes();
            }
            else if (command.equals("2")) {
                printFlights();
            }
            else if (command.equals("3")) {
                printPlaneInfo();
            }
        }
      
    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        database.addPlane(planeId, capacity);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        String flight = "("+ departure + "-" + destination + ")";
        database.addFlight(planeId, flight);
    }
    
    public void printPlanes() {
        this.database.printPlanes();
        System.out.println("");
    }
    
    public void printFlights() {
        this.database.printFlights();
        System.out.println("");
    }
    
    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.println(database.getSinglePlane(planeId));
    }
    
    
}
