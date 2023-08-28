//Savannah Crowder
//CSC 106 Computer Science II
//8-27-2023
//Jeremy Holley

public class Main {
    public static void main(String[] args){
        //create employee object w/ values
        Employee employee = new Employee("Bob", "Tech Department", "Software Devolper", 80000.0, 6);

        //employee previous salary
        double previousSalary = employee.getPay();
        //apply raise if applicable
        employee.giveRaise();

        //print previous salary and new salary
        System.out.println("Previous Salary: " + previousSalary);
        System.out.println("New Salary: " + employee.getPay());
    }
}