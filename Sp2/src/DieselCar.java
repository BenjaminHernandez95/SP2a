public class DieselCar extends GasolineCar {
    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int doors, int perLitre, boolean particleFilter) {
        super(registrationNumber, make, model, doors, perLitre);
        this.particleFilter = particleFilter;
    }

    public String getFuelType() {
        return "Diesel"; // skal returnere gasoline eller diesel
    }

    public boolean hasPaticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        int paticleFilterTax = 1000;

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            while (particleFilter == true) {
                return 330 + 130 + paticleFilterTax;
            }
            return 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            while (particleFilter == true) {
                return 1050 + 1390 + paticleFilterTax;
            }
            return 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            while (particleFilter == true) {
                return 2340 + 1850 + paticleFilterTax;
            }
            return 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            while (particleFilter == true) {
                return 5500 + 2770 + paticleFilterTax;
            }
            return 5500 + 2770;
        } else {
            while (particleFilter == true) {
                return 10470 + 15260 + paticleFilterTax;
            }
            return 10470 + 15260;
        }
    }


        @Override
        public String toString () {
            return super.toString() + ", Fuel Typer: " + getFuelType() + ", Particle Filter: " + particleFilter;
        }
    }

