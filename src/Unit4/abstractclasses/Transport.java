package Unit4.abstractclasses;

abstract public class Transport {
    public int power;
    public int maxSpeed;
    public int weight;
    public String transportBrand;

    public Transport(int power, int maxSpeed, int weight, String transportBrand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.transportBrand = transportBrand;
    }

    public double powerTransformation() {
        return power * 0.74;
    }
}
