// Problem 15: Abstract class Ride with different fare calculations

// Abstract class
abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    // Abstract method
    abstract double calculateFare();
}

// BikeRide subclass
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 5 * distance; // ₹5 per km
    }
}

// AutoRide subclass
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 8 * distance; // ₹8 per km
    }
}

// CarRide subclass
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 12 * distance; // ₹12 per km
    }
}

// Main class to test
public class RideDemo {
    public static void main(String[] args) {
        // Store different rides in an array
        Ride[] rides = {
            new BikeRide(10),
            new AutoRide(15),
            new CarRide(20)
        };

        // Runtime polymorphism: calculate fares
        for (Ride r : rides) {
            System.out.println(r.getClass().getSimpleName() + " fare: ₹" + r.calculateFare());
        }
    }
}
