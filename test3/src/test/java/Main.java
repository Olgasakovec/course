
public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.maxSpeed = 120;

        Civil ford = new Civil(200,50,85,"Ford",4,44,4,true,55,55);
        ford.info();
        Air boing = new Air(1000,555,555,"Boing",99,888);
        boing.getDescription();
        Cargo maz = new Cargo(987,588,666,"Maz",4,44,555,555);
        maz.load();
        Ground bmw = new Ground(100,555,556,"bmw",4,66);
        bmw.calculatedDistanceFuelСonsumption(1);
        Military military = new Military(3222,3333,33889,"military",66,666,true,666);
        military.eject();
        PassengerCar qqq = new PassengerCar(555,555,8888,"qqq",656,556,"sedan",55);
        qqq.getDescription();
    }
}
