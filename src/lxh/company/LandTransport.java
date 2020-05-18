package lxh.company;

public class LandTransport extends transport{

    @Override
    public void drivingMethod() {
        System.out.println("LandTransport add oil");
    }

    @Override
    public void load() {
        System.out.println("LandTransport load");

    }

    @Override
    public void maintain() {
        System.out.println("LandTransport maintain");

    }

    @Override
    public void addGas() {
        System.out.println("LandTransport add gas");

    }
}
