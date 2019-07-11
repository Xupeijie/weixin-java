package com.github.xupeijie.weixinjava.abstractFactory.detailFactory;

import com.github.xupeijie.weixinjava.abstractFactory.abstractFactory.EFactory;
import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.AirConditioner;
import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.Television;
import com.github.xupeijie.weixinjava.abstractFactory.detailProduct.TCLAirConditioner;
import com.github.xupeijie.weixinjava.abstractFactory.detailProduct.TCLTelevision;

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
