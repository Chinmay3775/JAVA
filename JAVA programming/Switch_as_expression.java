public class Switch_as_expression {
    public static void main (String a[])
    {
        String day= "Monday";
        String result="";
        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> result="6am";
            case "Sunday", "Saturday"->result="8am";
        
            default ->System.out.println("Invalid Input");
        }
        System.out.println(result);
    }
    
}
