package abstractFactory;

import abstractProduct.AirConditioner;
import abstractProduct.Television;

public interface EFactory {
    public Television produceTelevision();
    public AirConditioner produceAirConditioner();
}
