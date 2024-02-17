class HourlyEmployee extends Employee {

    private int wage;
    private int numberOfHoursWorked; 

    public HourlyEmployee(String firstName, String lastName, String SSN, int wage, int numberOfHoursWorked) {

        super(firstName, lastName, SSN);
        this.wage = wage; 
        this.numberOfHoursWorked = numberOfHoursWorked; 
    }

    public int getwage() {
        return wage; 
    }

    public int getnumberOfHoursWorked() {
        return numberOfHoursWorked; 
    }
}