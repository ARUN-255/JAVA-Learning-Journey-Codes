package InheritancePolymorphismAbstraction;

public class WrapperClassDemo {
    public static void main(String[] args) {
        
        //Giving a raw data 
        int score = 95;
        System.out.println("The normal score is "+score);

        //Autoboxing the score , that is converting the primitive datatype into a wrapper class
        Integer boxedScore = score;
        System.out.println("The boxed score is "+boxedScore);

        //Unboxing the score , that is converting the wrapper class into the primitive datatype
        int unboxedScore = score;
        System.out.println("The unboxed score is "+unboxedScore);
    }
}
