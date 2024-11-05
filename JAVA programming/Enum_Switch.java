enum Status{
    Running,Failed,Pending,Success;

}
public class Enum_Switch{
    public static void main(String[] args) {
      Status s = Status.Success;
        switch (s) {
          case Running:
            System.out.println("All Good");
            break;
          case Pending:
            System.out.println("Please Wait");
            break;
          case Failed:
            System.out.println("Try Again");
            break;
          default:
            System.out.println("Done");
            break;
        }
      }
    }