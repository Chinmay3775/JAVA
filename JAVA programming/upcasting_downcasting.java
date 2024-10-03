// public class upcasting_downcasting {
//     public static void main(String[] args) {
//         double d= 4.5;
//         int i= d;
//         System.out.println(i);
//     }
    
// }
// This is not possible as java doesn't allow direct casting

class A{

    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}
public class upcasting_downcasting{
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show1();

        A obj = (A) new B(); // upCasting (doesn't requried to use (A) )
        obj.show1();

        B obj1 = (B) obj; // DownCasting
        obj1.show2();
    }
}