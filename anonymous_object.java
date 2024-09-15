class A{
    public A()
    {
        System.out.println("object created");
    }
    public void show(){
        System.out.println("In A show ");
    }
}

public class anonymous_object{
    public static void main(String[] args) {
        // A obj; // here object with name is created 
        // obj=new A();
        // obj.show(); 

        new A(); // this is an anonymous object which has no name to access 
    }
    
    
}