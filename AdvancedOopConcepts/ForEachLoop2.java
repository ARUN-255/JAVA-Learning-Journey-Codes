package AdvancedOopConcepts;

class boys{
    int rollno;
    String name;
    int marks;
}

public class ForEachLoop2 {
    public static void main(StringDemo[] args) {
        
        boys b1 = new boys();

            b1.rollno = 001;
            b1.name = "Anbu";
            b1.marks = 100;

        boys b2 = new boys();
            
            b2.rollno = 002;
            b2.name = "Arun";
            b2.marks = 100;

        boys b3 = new boys();
            b3.rollno = 003;
            b3.name = "Bharath";
            b3.marks = 100;

        boys stud [] = new boys[3];
            stud[0] = b1;
            stud[1] = b2;
            stud[2] = b3;

            //for each loop 

            for(boys b : stud){
                System.out.println(b.rollno + " : " + b.name + " : " + b.marks + " . ");
            }

        


    }




    
}
