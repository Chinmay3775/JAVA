class A{
    public void showThedatawhichbelongstothisclass(){
        System.out.println("In A show");
    }
}
class B extends A{

    @Override
    public void showThedatawhichbelongstothisclass() {
        // TODO Auto-generated method stub
        super.showThedatawhichbelongstothisclass();
    }
    
    
}
public class Annotation {
    public static void main(final String[] args) {

    final B obj= new B();
    obj.showThedatawhichbelongstothisclass();
    }
}
