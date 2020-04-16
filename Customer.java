import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String Id;
    private List<String> BikeIds;
    Customer(String name, String Id){
        this.setName(name);
        this.setId(Id);
        setBikeId(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<String> getBikeIds() {
        return BikeIds;
    }

    public void setBikeId(List<String> bikeId) {
        BikeIds = bikeId;
    }
}
