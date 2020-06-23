package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    @Override
    public void eat() {
        System.out.println("Eating magnum");
    }

    public enum MagnumType {

        MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES

    }
    public MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type){
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }



}
