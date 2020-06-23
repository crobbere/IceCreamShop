package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{

    PriceList priceList;
    private double profit = 0;
    Stock stock;

    public IceCreamCar(PriceList priceList) {
        this.priceList = priceList;
    }

    public IceCreamCar(Stock stock) {
        this.stock = stock;
    }

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList = priceList;
        this.stock = stock;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        try {
            profit += priceList.getBallPrice() * flavors.length;
        } catch (NoMoreIceCreamException ni){
            System.out.println("No flavors left!");
        }

        return new Cone(flavors);
    }

    public Cone prepareCone(Cone.Flavor[] flavors){
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        try {
            profit += priceList.getRocketPrice();
        } catch (NoMoreIceCreamException ni){
            System.out.println("No Icerockets left!");
        }
        return new IceRocket();
    }
    public IceRocket prepareIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumtype) {
        try {
            profit += priceList.getMagnumStandardPrice();
        } catch (NoMoreIceCreamException ni ){
            System.out.println("No Magni left!");
        }
        return new Magnum(magnumtype);
    }

    public double getProfit() {
        return profit;
    }
}
