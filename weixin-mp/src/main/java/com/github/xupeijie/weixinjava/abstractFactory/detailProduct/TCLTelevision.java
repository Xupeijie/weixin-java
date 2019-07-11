package com.github.xupeijie.weixinjava.abstractFactory.detailProduct;

import com.github.xupeijie.weixinjava.abstractFactory.abstractProduct.Television;

public class TCLTelevision implements Television {
    @Override
    public void play() {
        System.out.println("TCL电视机播放中......");
    }
}
