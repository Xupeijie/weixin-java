package com.github.xupeijie.weixinjava.abstractFactory;

import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.AirConditioner;
import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.Television;
import com.github.xupeijie.weixinjava.abstractFactory.abstractFactory.EFactory;
import com.github.xupeijie.weixinjava.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        try {
            EFactory factory;
            Television tv;
            AirConditioner ac;
            factory = (EFactory) XMLUtil.getBean();
            tv = factory.produceTelevision();
            tv.play();
            ac = factory.produceAirConditioner();
            ac.changeTemperature();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
