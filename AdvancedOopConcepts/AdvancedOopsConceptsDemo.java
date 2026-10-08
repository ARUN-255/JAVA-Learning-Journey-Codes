package AdvancedOopConcepts;

class students{
    int rollno;
    String name;
    int marks;
}

public class AdvancedOopsConceptsDemo {
    public static void main(StringDemo[] args) {

        students s1 = new students();
        
        s1.rollno = 1;
        s1.name = "Arun";
        s1.marks = 100;

        students s2 = new students();

        s2.rollno = 2;
        s2.name = "Harish";
        s2.marks = 99;

        students s3 = new students();

        s3.rollno = 3;
        s3.name = "Guna Saker";
        s3.marks = 99;

        students student [] = new students[3];

        student [0] = s1;
        student [1] = s2;
        student [2] = s3;

        for (int i = 0 ; i < student.length ; i++){
            System.out.println(student[i].rollno + " : " + student[i].name + " : " + student[i].marks + " . " );
        }
    }
}
