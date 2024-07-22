class Mobile{
    String brand;
    int price;
    static String name;
    public static void show(Mobile obj)
    {
        System.out.println(obj.brand +":" +obj.price+":" +name);
    }
}
class static_method{
    public static void main(String [] args)
    {
        Mobile obj1= new Mobile();
        obj1.brand="Samsung";
        obj1.price=10000;

        Mobile obj2= new Mobile();
        obj2.brand="Apple";
        obj2.price=100000;

        Mobile.name="Smartphone";

        Mobile.show(obj1);
        Mobile.show(obj2);
        
    }
} 
