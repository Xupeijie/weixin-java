package detailFactory;

import abstractFactory.EFactory;
import abstractProduct.AirConditioner;
import abstractProduct.Television;
import detailProduct.TCLAirConditioner;
import detailProduct.TCLTelevision;

public class TCLFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAirConditioner();
    }
}
