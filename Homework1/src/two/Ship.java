public class Ship {
    
    private String shipName; 
    private String shipBuiltYear; 

    public Ship(String shipName, String shipBuiltYear) {
        this.shipName = shipName; 
        this.shipBuiltYear = shipBuiltYear; 
    }

    public String getshipName() {
        return shipName; 
    }

    public String getshipBuiltYear() {
        return shipBuiltYear; 
    }

    public void setshipName(String shipName) {
        this.shipName = shipName; 
    }

    public void setshipBuiltYear(String shipBuiltYear) {
        this.shipBuiltYear = shipBuiltYear; 
    }

    public void printShip() {
        System.out.println("Name: " + getshipName() + "\nBuild in year: " + getshipBuiltYear());
    }

}
