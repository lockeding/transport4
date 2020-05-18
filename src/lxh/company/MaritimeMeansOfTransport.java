package lxh.company;

public class MaritimeMeansOfTransport extends transport{
    @Override
    public void drivingMethod() {
        System.out.println("MaritimeMeansOfTransport add oil");
    }

    @Override
    public void load() {
        System.out.println("MaritimeMeansOfTransport load");

    }

    @Override
    public void maintain() {
        System.out.println("MaritimeMeansOfTransport maintain");

    }

    @Override
    public void addGas() {
        System.out.println("MaritimeMeansOfTransport add gas");

    }
}
