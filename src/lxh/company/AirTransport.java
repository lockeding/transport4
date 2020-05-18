package lxh.company;

public class AirTransport extends transport{
    @Override
    public void drivingMethod() {
        System.out.println("AirTransport add oil");
    }

    @Override
    public void load() {
        System.out.println("AirTransport load");

    }

    @Override
    public void maintain() {
        System.out.println("AirTransport maintain");

    }

    @Override
    public void addGas() {
        System.out.println("AirTransport add gas");

    }
}
