package com.github.xupeijie.weixinjava.abstractFactory.detailProduct;

import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.AirConditioner;

public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中......");
    }
}
