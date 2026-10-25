package InheritancePolymorphismAbstraction;

abstract class AbstractNotification{

    //creating a abstract class
    abstract void sendNotification();

    void notification(){
         System.out.println("The SMS have been initiated " );
    }
}
class EmailNotification extends AbstractNotification{
    @Override 
    void sendNotification(){
        System.out.println("Opening SMPT sever notification...");
        System.out.println("Email sent successfully");
    }
}

public class AbstractKeywordDemo1 {
    public static void main(String[] args) {
        
        //Upcasting
        AbstractNotification object = new EmailNotification();
        //printing
        object.notification();
        object.sendNotification();
    }
}
