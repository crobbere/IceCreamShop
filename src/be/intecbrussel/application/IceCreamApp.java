package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList1 = new PriceList(1,2,3);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList1);
        Eatable[] eatables = new Eatable[]{iceCreamSalon.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS), iceCreamSalon.orderIceRocket()};
        for(Eatable e : eatables){
            e.eat();
        }
        System.out.println("Total factured: " +  iceCreamSalon.getProfit());
    }

}
