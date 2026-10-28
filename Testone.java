interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    protected String vehicleNumber;
    protected String vehicleType;
    protected int parkingHours;

    public VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    public TwoWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Two Wheeler", parkingHours);
    }

        public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        } else {
            return (2 * 20) + ((parkingHours - 2) * 10);
        }
    }

       public void displayParkingDetails() {
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Parking Hours  : " + parkingHours + " hours");
        System.out.println("Total Charge   : Rs. " + calculateCharge());
       
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    public FourWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Four Wheeler", parkingHours);
    }

        public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        } else {
            return (2 * 50) + ((parkingHours - 2) * 30);
        }
    }
    public void displayParkingDetails() {
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Parking Hours  : " + parkingHours + " hours");
        System.out.println("Total Charge   : Rs. " + calculateCharge());
        
    }
}


public class Testone {
    public static void main(String[] args) {
       
        ParkingCharge parkingRef;

        System.out.println("--- Parking Management System ---\n");

        // Runtime Polymorphism: Pointing interface reference to a TwoWheeler object
        parkingRef = new TwoWheeler("KA-01-HE-1234", 5);
        System.out.println("Demonstrating Runtime Polymorphism for Two Wheeler:");
        parkingRef.displayParkingDetails();

        // Runtime Polymorphism: Pointing interface reference to a FourWheeler object
        parkingRef = new FourWheeler("DL-03-CC-5678", 4);
        System.out.println("Demonstrating Runtime Polymorphism for Four Wheeler:");
        parkingRef.displayParkingDetails();
    }
}
