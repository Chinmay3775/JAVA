
class A{
    int age;
    public void show(){
        System.out.println("in Show");

    }
    static class B{
        public void config(){
            System.out.println("in config");
        }

    }
}
    public class inner_class {
    public static void main(String[] args) {
        A obj= new A();
        obj.show();
        //A.B obj1= obj.new B(); if inner class is not statiic 
        //obj1.config();
        A.B obj1= new A.B(); //if inner class is static
        obj1.config();
    }
    
}
