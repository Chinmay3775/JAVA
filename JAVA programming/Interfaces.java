// abstract class A{
//     public abstract void show();
//     public abstract void config();
    
// }
 interface A{
    int age =21;
    String s="Mumbai";
    void show();
    void config();
    
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class Interfaces{
    public static void main(String a[])
    {
        A obj;
        obj=new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.s);
        // A.s="Hyderabad"; This won't work as the variables in interface are static and finally
    }
}