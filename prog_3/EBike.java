package transport;

public class EBike extends Bicycle {
    private int battery;

    public EBike(String id, int battery) {
    	//first calls bicycle (which also calls vehicle)
        super(id);
        this.battery = battery;
        System.out.println("EBike() constructor called");
    }

    @Override
    public void deliver(String item, String place) {
        System.out.println("Checking battery: " + battery + "%");
        //call parent method using super
        super.deliver(item, place);
    }
}
