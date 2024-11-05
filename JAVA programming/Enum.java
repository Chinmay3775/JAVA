enum Status{
    Running,Failed,Pending,Success;

}
public class Enum{
    public static void main(String[] args) {
        int i =5;
        Status[] s = Status.values();
        for(Status k:s){
        System.out.println(k+":"+k.ordinal()); // output :  Running:0 Failed:1 Pending:2 Success:3
        }
        
    }
}