package transport;
//abstract base for all vehicles
public abstract class Vehicle {
    protected String id;

    public Vehicle(String id) 
    {
        System.out.println("Vehicle() constructor called");
    }

    public abstract void deliver(String item, String place);
}
