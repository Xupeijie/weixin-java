package detailFactory;

import abstractFactory.EFactory;
import abstractProduct.AirConditioner;
import abstractProduct.Television;
import detailProduct.HaierAirConditioner;
import detailProduct.HaierTelevision;

public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
