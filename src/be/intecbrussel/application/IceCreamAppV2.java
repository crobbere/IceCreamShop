package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList1 = new PriceList(1,2,3);
        Stock stock = new Stock(5,10,25, 12);
        IceCreamCar iCCar = new IceCreamCar(priceList1);
        Eatable[] eatables = new Eatable[]{iCCar.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE),
                iCCar.orderMagnum(Magnum.MagnumType.ALPINENUTS), iCCar.orderIceRocket()};
        for(Eatable e : eatables){
            e.eat();
        }
        System.out.println("Total factured: " +  iCCar.getProfit());
    }

}

