public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int doors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, doors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity; // returnerer batterikapacitet i kw timer
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public double getWhPrKm() {
        int WhPrKm = batteryCapacity/ maxRange;
        double s = (WhPrKm/91.25)/100;
        return s;

    }

    public int getRegistrationFee() {
        if (getWhPrKm() >= 20 && getWhPrKm() <= 50 ){
            return 330;
        }
        else if(getWhPrKm() >= 15 && getWhPrKm() <= 20){
            return 1050;
        }
        else if(getWhPrKm() >= 10 && getWhPrKm() <= 15){
            return 2340;
        }

        else if(getWhPrKm() >= 5 && getWhPrKm() <= 10){
            return 5500;
        }
        else{
            return 10470;
        }

    }
    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + batteryCapacity + " kWh, Max Range: " + maxRange + " km";    }
}