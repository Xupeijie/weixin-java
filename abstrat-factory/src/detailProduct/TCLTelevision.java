package detailProduct;

import abstractProduct.Television;

public class TCLTelevision implements Television {
    @Override
    public void play() {
        System.out.println("TCL电视机播放中......");
    }
}
