package AdvancedOopConcepts;

class Employee{

    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        if(salary>0){
            this.salary = salary;
        }else{
            System.out.println("Salary should be greater than zero");
        }
    }
}

public class EncapsulationDemo1 {
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        emp.setName("Arun");
        emp.setSalary(100000);

        System.out.println(emp.getName() + " earns " + emp.getSalary() );

        emp.setSalary(-5000);

    }
}
