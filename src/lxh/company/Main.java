package lxh.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge("20");
        person.setName("李四");
        person.setId("201902200");
        person.setSex("man");

        person.detailMess();

        Aircraft aircraft = new Aircraft();
        aircraft.setId("aircraft1");
        person.transportMethod(aircraft);
        System.out.println("---------------------------------------------");

        Airship airship = new Airship();
        airship.setId("airship1");
        person.transportMethod(airship);
        System.out.println("---------------------------------------------");

        Automobile automobile = new Automobile();
        automobile.setId("automobile1");
        person.transportMethod(automobile);
        System.out.println("---------------------------------------------");

        Bicycle bicycle = new Bicycle();
        bicycle.setId("bicycle1");
        person.transportMethod(bicycle);
        System.out.println("---------------------------------------------");

        HotAirBallon hotAirBallon = new HotAirBallon();
        hotAirBallon.setId("hotAirballon1");
        person.transportMethod(hotAirBallon);
        System.out.println("---------------------------------------------");

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setId("hovercraft1");
        person.transportMethod(hovercraft);
        System.out.println("---------------------------------------------");

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setId("motorcycle1");
        person.transportMethod(motorcycle);
        System.out.println("---------------------------------------------");

        Submarine submarine = new Submarine();
        submarine.setId("submarine1");
        person.transportMethod(submarine);
        System.out.println("---------------------------------------------");

        Train train = new Train();
        train.setId("train1");
        person.transportMethod(train);
        System.out.println("---------------------------------------------");


        Ship ship = new Ship();
        ship.setId("ship1");
        person.transportMethod(ship);
    }
}
