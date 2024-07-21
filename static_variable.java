class Mobile{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand +":" +price+":" +name);
    }
}
class static_variable{
    public static void main(String [] args)
    {
        Mobile obj1= new Mobile();
        obj1.brand="Samsung";
        obj1.price=10000;

        Mobile obj2= new Mobile();
        obj2.brand="Apple";
        obj2.price=100000;

        Mobile.name="Smartphone";

        obj1.show();
        obj2.show();
    }
} 
