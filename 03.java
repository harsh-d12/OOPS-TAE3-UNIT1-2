class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    // Method to accept CarId and CarType
    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    // Method to calculate rent
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            Rent = 1000;
        } 
        else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } 
        else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } 
        else {
            Rent = 0;
        }
        return Rent;
    }

    // Method to show car details
    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL car = new CARRENTAL();

        car.GetCar(101, "SUV");
        car.GetRent();
        car.ShowCar();
    }
}
