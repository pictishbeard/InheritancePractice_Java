package staff;

public abstract class Employee {

    private String name;
    private int NInumber;
    private double salary;

    public Employee(String name, int NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;

    }

    public String getName(){
        return name;}

    public int getNINumber(){
        return NInumber;}


    public double getSalary(){
        return salary; }

    public double raiseSalary(double incSalary) {

        incSalary = salary++;
        return incSalary;
    }





}
