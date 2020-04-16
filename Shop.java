import java.util.*;

public class Shop {
    private Map<String, Object> bikeInventory;
    private Map<String, Object> rentedBike;
    private List<Customer> customerList;
//    private RateList list;

    public Shop(){
        bikeInventory=new HashMap<>();
        rentedBike=new HashMap<>();
        customerList=new ArrayList<>();
//        list=new RateList();
    }

    public void addBike(Bike motorBike){
        bikeInventory.put(motorBike.getNumberPlate(),motorBike);
        Map<String, Integer> rate=new HashMap<>();
        rate.put("Daily",motorBike.getDailyRate());
        rate.put("Weekly",motorBike.getWeeklyRate());
        rate.put("Hourly",motorBike.getHourlyRate());
        rate.put("Family",motorBike.getFamilyRate());
//        list.addRate(motorBike.getName(),rate);
    }

    public Bike removeBike(String BikenumberPlate){
        return (Bike) bikeInventory.remove(BikenumberPlate);
    }

    public void returnBike(String numberPlate,Customer c){
        if(c.getBikeIds().contains(numberPlate)){
            Bike b= (Bike) rentedBike.remove(numberPlate);
            b.setReturnTime(new Date());
            bikeInventory.put(numberPlate,b);
        } else {
            System.out.println("Same bike is not returned Please recheck Bike Number");
        }
    }

    public void rentBike(String numberPlate,Customer c){
        Bike b=(Bike) bikeInventory.remove(numberPlate);
        b.setRentedTime(new Date());
        rentedBike.put(numberPlate,b);
        if(!customerList.contains(c))
        customerList.add(c);
    }
    public int getBill(Customer c){
        List<String> bikes=c.getBikeIds();
//        for(String id:bikes){
//            
//        }
    }
}
