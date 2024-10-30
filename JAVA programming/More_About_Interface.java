// class to class --> extends
// class to  interface --> implements
//interface to interface --> extends
interface A{
    int age = 44;
    String area="Mumbai";

    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X {
      
}
class B implements A,Y{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("In Run");
    }


}
public class More_About_Interface {
    public static void main(String[] args) {
        A obj;
        obj= new B();
        obj.show();
        obj.config();
        X obj1= new B();
        obj1.run();
        System.out.println(A.area);
    }
    
}
