class Mobile
{
    
    String Brand;
    int price;
    static String name;
    
    public  Mobile()
    {
        System.out.println("in constructor");
    }
    static
    {
        System.out.println("In static block");
    }
}
class static_block {

    public static void main(String[] args) throws ClassNotFoundException
    {
        
    Class.forName("Mobile");

    
    //Mobile mob1 =new Mobile();
    //Mobile mob2 =new Mobile();
    }
}