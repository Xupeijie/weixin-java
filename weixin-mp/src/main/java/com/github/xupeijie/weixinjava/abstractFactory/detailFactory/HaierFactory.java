package com.github.xupeijie.weixinjava.abstractFactory.detailFactory;

import com.github.xupeijie.weixinjava.abstractFactory.abstractFactory.EFactory;
import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.AirConditioner;
import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.Television;
import com.github.xupeijie.weixinjava.abstractFactory.detailProduct.HaierAirConditioner;
import com.github.xupeijie.weixinjava.abstractFactory.detailProduct.HaierTelevision;
import org.springframework.stereotype.Component;

@Component
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
