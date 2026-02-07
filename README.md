class Main {
    String name;
    int capacity;
       Main(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    String getVehicleName() {
        return name;
    }
    int getVehicleCapacity() {
        return capacity;
    }
    public static void main(String[] args) {
        Main vehicle = new Main("Car", 5);
        System.out.println("Vehicle Name: " + vehicle.getVehicleName());
        System.out.println("Vehicle Capacity: " + vehicle.getVehicleCapacity());
    }
}
