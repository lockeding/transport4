package lxh.company;

import java.util.Date;

public abstract class transport {

    private String ownership;
    private String GPSPosition;
    private String price;

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Date dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Date dataOfPurchase;
    private String id;

    public void Transport(){

    }

    public void Transport(String s){

    }

    public abstract void drivingMethod();

    public abstract void load();

    public abstract void maintain();

    public abstract void addGas();
}
