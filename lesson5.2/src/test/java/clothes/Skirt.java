package clothes;

public class Skirt extends Clothe implements WomenWear {

    public Skirt(int sizewear, int costwear, String colorwear) {
        super(sizewear, costwear, colorwear);
    }

    @Override
    public void towearwomen() {
        System.out.println("Юбка одета для женщин");
    }
}
