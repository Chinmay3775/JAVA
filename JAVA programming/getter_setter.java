
class sum
{
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    
    public int add(){
        int c=a+b;
        return c;
    }
}
public class getter_setter {
    public static void main(String args[])
    {
        sum s =new sum();
        s.setA(5);
        s.setB(7);
        System.out.println("Addition " + s.add());
    }
    
}