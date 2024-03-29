public class Transport {
    public Transport() {
    }

    private double power;
    public double maxSpeed;
    private double weight;
    private String brand;

    public Transport(double power, double maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public double convertPowerToKilowatts() {
        return getPower() * 0.74;
    }
}

