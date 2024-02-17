public class Driver {
    public static void main(String[] args) {
        SalariedEmployee Jones = new SalariedEmployee("Joe", "Jones", "111-11-111", 2500); 
        HourlyEmployee Smith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee Quinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47); 
        CommissionEmployee Dior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000); 
        SalariedEmployee Chanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700); 
        BaseEmployee Davenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000); 
        CommissionEmployee Vaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000); 

 
        System.out.println("Name: " + Jones.getfirstName() + " " + Jones.getlastName() + "\nSSN: " + Jones.getSSN() + "\nWeekly Salary - $" + Jones.getweeklySalary() + "\n"); 
        System.out.println("Name: " + Smith.getfirstName() + " " + Smith.getlastName() + "\nSSN: " + Smith.getSSN() + "\nWage: " + Smith.getwage() + "\nHours Worked: " + Smith.getnumberOfHoursWorked() + "\n");
        System.out.println("Name: " + Quinn.getfirstName() + " " + Quinn.getlastName() + "\nSSN: " + Quinn.getSSN() + "\nWage: " + Quinn.getwage() + "\nHours Worked: " + Quinn.getnumberOfHoursWorked() + "\n");
        System.out.println("Name: " + Dior.getfirstName() + " " + Dior.getlastName() + "\nSSN: " + Dior.getSSN() + "\nCommission rate: " + Dior.gecommissionRate() + "\nGross sales: " + Dior.getgrossSales() + "\n");
        System.out.println("Name: " + Chanel.getfirstName() + " " + Chanel.getlastName() + "\nSSN: " + Chanel.getSSN() + "\nWeekly Salary - $" + Chanel.getweeklySalary() + "\n"); 
        System.out.println("Name: " + Davenport.getfirstName() + " " + Davenport.getlastName() + "\nSSN: " + Davenport.getSSN() + "\nBase Salary: " + Davenport.getbaseSalary() + "\n");
        System.out.println("Name: " + Vaziri.getfirstName() + " " + Vaziri.getlastName() + "\nSSN: " + Vaziri.getSSN() + "\nCommission rate: " + Vaziri.gecommissionRate() + "\nGross sales: " + Vaziri.getgrossSales() + "\n");



    }
}
