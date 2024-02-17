class CommissionEmployee extends Employee {

    private int commissionRate; 
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String SSN, int commissionRate, int grossSales) {

        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate; 
        this.grossSales = grossSales; 
    }

    public int gecommissionRate() {
        return commissionRate; 
    }

    public int getgrossSales() {
        return grossSales; 
    }

}