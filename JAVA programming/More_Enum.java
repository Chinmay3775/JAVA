enum Laptop{
    Macbook(2000),XPS(2200),Surface,ThinkPad(1800);
    private int price;
    
    private Laptop() {
      price=500;
    }
  
    private Laptop(int price) {
      this.price = price;
      System.out.println("in laptop "+this.name());
    }
  
    public int getPrice() {
      return price;
    }
  
    public void setPrice(int price) {
      this.price = price;
    }
  
    
  }
  public class More_Enum{
      public static void main(String[] args) {
         
          // Laptop lap=Laptop.Macbook;
          // System.out.println(lap+":"+lap.getPrice()); to get single object
          for(Laptop lap:Laptop.values()){
          System.out.println(lap+" : "+lap.getPrice());
        }
        }
      }