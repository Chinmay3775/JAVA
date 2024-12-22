@FunctionalInterface
interface  A{
   
   void show(int i);
}
public class lambda{
   public static void main(String[] args) {
      A obj =i -> System.out.println("In show "+i);
      obj.show(6);
    
   } 
}
