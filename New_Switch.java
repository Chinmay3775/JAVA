class New_Switch 
{
    public static void main(String a[])
    {
        String day="Sunday";
        switch (day) {
            case "Sunday","Saturday"->System.out.println("8am");
            case "Monday","Tuesday","Wednesday","Thursday","Friday"-> System.out.println("7am");
            default ->System.out.println("invalid input");
        }
    }
    

}
