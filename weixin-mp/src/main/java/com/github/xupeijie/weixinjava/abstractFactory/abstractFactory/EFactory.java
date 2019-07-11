package com.github.xupeijie.weixinjava.abstractFactory.abstractFactory;

import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.AirConditioner;
import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.Television;

public interface EFactory {
    public Television produceTelevision();
    public AirConditioner produceAirConditioner();
}
