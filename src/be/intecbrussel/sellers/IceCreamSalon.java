package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    private double totalProfit = 0;

    private PriceList priceList;

    public IceCreamSalon(PriceList pricelist) {
        this.priceList = pricelist;
    }

    public double getProfit(){
        return totalProfit;
    }



    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        try {
            totalProfit += priceList.getBallPrice() * flavors.length;
        } catch (NoMoreIceCreamException ni){
            System.out.println("No flavors left!");
        }
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        try {
            totalProfit += priceList.getRocketPrice();
        } catch (NoMoreIceCreamException ni){
            System.out.println("No Icerockets left!");
        }
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumtype) {
        try {
            totalProfit += priceList.getMagnumStandardPrice();
        } catch (NoMoreIceCreamException ni ){
            System.out.println("No Magni left!");
        }
        return new Magnum(magnumtype);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "totalProfit=" + totalProfit +
                ", pricelist=" + priceList +
                '}';
    }

    public double getTotalProfit(){
        return this.totalProfit;
    }
}
