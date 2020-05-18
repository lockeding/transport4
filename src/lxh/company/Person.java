package lxh.company;

import com.sun.jdi.connect.Transport;

public class Person {
    private String id;
    private String name;
    private String sex;
    private String age;

    public void detailMess(){
        System.out.println("I'm "+name+' '+id+" "+ sex +' ' +age);
    }

    public void transportMethod(AirTransport airTransport){
        airTransport.drivingMethod();
        airTransport.addGas();
        airTransport.load();
        airTransport.maintain();
    }

    public void transportMethod(LandTransport landTransport){
        landTransport.drivingMethod();
        landTransport.addGas();
        landTransport.load();
        landTransport.maintain();
    }

    public void transportMethod(MaritimeMeansOfTransport maritimeMeansOfTransport){
        maritimeMeansOfTransport.drivingMethod();
        maritimeMeansOfTransport.addGas();
        maritimeMeansOfTransport.load();
        maritimeMeansOfTransport.maintain();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
