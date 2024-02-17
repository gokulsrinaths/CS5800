class Employee {
    private String firstName;
    private String lastName;
    private String SSN; 

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN; 
    }

    public String getfirstName() {
        return firstName; 
    }

    public String getlastName() {
        return lastName; 
    }

    public String getSSN() {
        return SSN; 
    }
}
