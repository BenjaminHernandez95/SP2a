import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car>fleet = new ArrayList<Car>();

    public void addCar(Car car){
fleet.add(car);

    }

    public int getTotalRegistrationFeeForFleet(){
int totalRegistrationFeeForFleet = 0;
for (Car car : fleet){
    totalRegistrationFeeForFleet += car.getRegistrationFee();
}
return totalRegistrationFeeForFleet;
    }

    @Override
    public String toString() {
        int count = 1;
        for(int i=0; i<fleet.size(); i++){
            System.out.println(count+i+": "+ fleet.get(i));
        }

        return "";
    }
}
