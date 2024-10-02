
class A{
    public void show(){
        System.err.println("In A");
    }
}
class B extends A {
    public void show(){
        System.out.println("In B");
    }
}
class C extends B{
    public void show(){
        System.out.println("In C");
    }
}

 class Dynamic_method_dispatch {
     public static void main(String[] args) {
        A obj =new A();
        obj.show();
        obj = new B();
        obj.show();
        obj= new C();
        obj.show();
        
     }
 }
