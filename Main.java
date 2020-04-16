import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //
      Shop Mittalgrage=new Shop();
      int count=10;
      String name;
      String numberPlate;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Bike name");
      name=s.nextLine();
      System.out.println("Enter Bike number");
      numberPlate=s.nextLine();

      while(count>0){

          Bike bike=new Bike(name,numberPlate+count);
          Mittalgrage.addBike(bike);
          count--;
      }
      count=5;
      System.out.println("Please put name");
      name =s.nextLine();
      System.out.println("Please put id");
      String id=s.nextLine();
      Customer c=new Customer(name,id);
      while(count>0){
          c=new Customer(name+count,id+count);
          c.getBikeIds().add(numberPlate+count);
       Mittalgrage.rentBike(numberPlate+count,c);
       count--;
      }
      count=5;
      while (count>0){
          c=new Customer(name+count,id+count);
          Mittalgrage.returnBike(numberPlate,c);
      count--;
      }
  }
}
