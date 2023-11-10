public class Main {
    public static void main(String[] args) {

        ElectricCar eCar1 = new ElectricCar("Appelsinerne","Tesla", "S",5,100, 634);
        ElectricCar eCar2 = new ElectricCar("Appelsinerne","Tesla", "X",5,95, 634);
        ElectricCar eCar3 = new ElectricCar("Appelsinerne","Tesla", "Cybertruck",5,200, 634);

        GasolineCar gCar1 = new GasolineCar("Appelsinerne","Nissan","Mirca", 3,15);
        GasolineCar gCar2 = new GasolineCar("Appelsinerne","Ford","Focus", 5,21);
        GasolineCar gCar3 = new GasolineCar("Appelsinerne","Toyota","Aygo", 3,17);

        DieselCar dCar1 = new DieselCar("Appelsinerne","Ford","Century", 5, 5, true );
        DieselCar dCar2 = new DieselCar("Appelsinerne","Ford","Century", 5, 7, false);
        DieselCar dCar3 = new DieselCar("Appelsinerne","Ford","Century",5,7,false);




        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(eCar1);
        fleetOfCars.addCar(eCar2);
        fleetOfCars.addCar(eCar3);

        fleetOfCars.addCar(gCar1);
        fleetOfCars.addCar(gCar2);
        fleetOfCars.addCar(gCar3);

        fleetOfCars.addCar(dCar1);
        fleetOfCars.addCar(dCar2);
        fleetOfCars.addCar(dCar3);



        fleetOfCars.toString();
        System.out.println("Total registration fee: "+ fleetOfCars.getTotalRegistrationFeeForFleet()+" kr");
    }

}