enum Status{
    Running,Failed,Pending,Success;

}
public class Enum_if_else{
    public static void main(String[] args) {
      Status s = Status.Pending;
        if(s==Status.Pending){
          System.out.println("All Good");
        }
        else if(s==Status.Failed){
          System.out.println("Try Again");
        }
        else if(s==Status.Running){
          System.out.println("Please Wait");
        }
        else 
          System.out.println("Done");

      }
    }