public class method_overloading {
    
    public static void main(String[] args) {
      Addition a=new Addition();
      int r1 = a.add(2, 3, 6);
        int r2=  a.add(5 , 7) ; 
        System.out.println(r1);
        System.out.println(r2); 
    }
}
class Addition
{
    public int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}