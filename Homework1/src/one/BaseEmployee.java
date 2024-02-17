public class BaseEmployee extends Employee{
    
    private int baseSalary;

    public BaseEmployee(String firstName, String lastName, String SSN, int baseSalary) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary; 
    }

    public int getbaseSalary() {
        return baseSalary; 
    }


}
