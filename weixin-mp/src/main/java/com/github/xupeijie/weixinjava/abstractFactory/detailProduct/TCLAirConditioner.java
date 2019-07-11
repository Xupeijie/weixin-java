package com.github.xupeijie.weixinjava.abstractFactory.detailProduct;

import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.AirConditioner;

public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中......");
    }
}
