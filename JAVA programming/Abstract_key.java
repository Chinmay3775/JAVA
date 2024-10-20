abstract class Car{
    public abstract void drive();
    public abstract void fly();
    
    public void playmusic(){
        System.out.println("play music");
    }
} 
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
    public void fly(){
        System.out.println("Flying");
    }

}
public class Abstract_key {
    public static void main(String[] args) {
        Car obj= new WagonR();
        obj.drive();
        obj.playmusic();
        
    }
}
