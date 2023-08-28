//Savannah Crowder
//CSC 106 Computer Science II
//8-27-2023
//Jeremy Holley

public class Employee {
    //fields
    private String name;
    private String department;
    private String position;
    private double pay;
    private int years;

    public Employee() { //Constructor
    }

    //Overloaded constructor
    public Employee(String name, String department, String position, double pay, int years){
        this.name = name;
        this.department = department;
        this.position = position;
        this.pay = pay;
        this.years = years;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public String getPosition(){
        return position;
    }
    public double getPay(){
        return pay;
    }
    public int getYears(){
        return years;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public void setYears(int years){
        this.years = years;
    }
    //giving raise method
    public void giveRaise(){
        if (department.equals("Tech Department") && years >= 5){
            double raiseAmount = pay * 0.05;
            pay += raiseAmount;
        }
    }
}