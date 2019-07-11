package com.github.xupeijie.weixinjava.abstractFactory.detailProduct;

import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.Television;

public class HaierTelevision implements Television {
    @Override
    public void play() {
        System.out.println("海尔电视机播放中......");
    }
}
