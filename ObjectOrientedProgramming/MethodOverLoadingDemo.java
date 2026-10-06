package ObjectOrientedProgramming;

class Calculator6{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2, double n3, double n4){
        return n1 + n2 + n3 + n4;
    }
}

public class MethodOverLoadingDemo {
    public static void main(String []args){
        Calculator6 obj  = new Calculator6();
        double r1 = obj.add(2,233);
        System.out.println(r1);

    }
}
