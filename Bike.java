import java.util.Date;

public class Bike {
    private String name;
    private String numberPlate;
    private int hourlyRate;
    private int weeklyRate;
    private int dailyRate;
    private int familyRate;
    private Date returnTime;
    private Date rentedTime;
    private Customer customer;

    public Bike(String name,String numberPlate){
        this.setName(name);
        this.setNumberPlate(numberPlate);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(int weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getFamilyRate() {
        return familyRate;
    }

    public void setFamilyRate(int familyRate) {
        this.familyRate = familyRate;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Date getRentedTime() {
        return rentedTime;
    }

    public void setRentedTime(Date rentedTime) {
        this.rentedTime = rentedTime;
    }


}
