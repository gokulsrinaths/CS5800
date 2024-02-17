public class CargoShip extends Ship {

    private int cargoCapacityTonnage;  

    public CargoShip(String shipName, String shipBuiltYear, int cargoCapacityTonnage) {
        super(shipName, shipBuiltYear);
        this.cargoCapacityTonnage = cargoCapacityTonnage; 
    }

    public void setcargoCapacityTonnage(int cargoCapacityTonnage) {
        this.cargoCapacityTonnage = cargoCapacityTonnage; 
    }

    public int getcargoCapacityTonnage() {
        return cargoCapacityTonnage; 
    }

    @Override
    public void printShip() {
        System.out.println("Name: " + getshipName() + "\nCargo capacity: " + getcargoCapacityTonnage());
    }
}
