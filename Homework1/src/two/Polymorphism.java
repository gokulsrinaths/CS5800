public class Polymorphism {
    public static void main(String[] args) {
        Ship[] shipArray = new Ship[3]; 
        shipArray[0] = new Ship("Celestial Voysger", "1989"); 
        shipArray[1] = new CargoShip("Aquamarine Drea", "1967", 56435); 
        shipArray[2] = new CruiseShip("Serenity's Grace", "1954", 35353); 

        for(int ship = 0; ship < shipArray.length; ship++) {
            shipArray[ship].printShip();
            System.out.println("\n");
        }

    }
}
