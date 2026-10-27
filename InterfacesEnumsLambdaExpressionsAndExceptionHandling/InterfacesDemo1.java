package InterfacesEnumsLambdaExpressionsAndExceptionHandling;

//interface 1
interface Camera{
    void takePhoto();
}

//interface 2
interface MusicPlayer{
    void playMusic();
}

//implementing both the interfaces via a class
class SmartPhone implements Camera, MusicPlayer{
    
    //calling a method from camera
    public void takePhoto(){
        System.out.println("Click!, took a high quality photo");
    }

    //calling a method from music player
    public void playMusic(){
        System.out.println("Playing a romantic song. lalala!");
    }

    //creating a own method for this class
    void browseInternet(){
        System.out.println("Reading a blog post from wikipedia");
    }
}

public class InterfacesDemo1 {
    public static void main(String[] args) {
        
        //Senario A direcct creation
        SmartPhone object = new SmartPhone();
        System.out.println("Using smartphone reference");
        object.takePhoto();
        object.playMusic();
        object.browseInternet();
    }
}
