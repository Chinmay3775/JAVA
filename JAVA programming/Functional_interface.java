@FunctionalInterface
interface  A{

   void show();
    
}

// class B implements A{
//    public void show(){
//       System.out.println("In Show");
//    }
// }
public class Functional_interface {
   public static void main(String[] args) {
      A obj =new A() {
         public void show(){
            System.out.println("In show");
         }
      };
      obj.show();
    
   } 
}
