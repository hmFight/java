package com.wj.thread.pro.shoe;

import static com.wj.thread.pro.shoe.Shoe.LEFT;
import static com.wj.thread.pro.shoe.Shoe.RIGHT;

/**
 * @author : wangjia
 * @time : 2018/2/6 13:39
 */
public class Manager extends Thread {
    private ShoeHolder shoeHolder;

    public Manager(ShoeHolder shoeHolder) {
        this.shoeHolder = shoeHolder;
    }

    public void work() {
        start();
    }

    @Override
    public void run() {
        while (true) {
            int leftSize = shoeHolder.leftSize();
            int rightSize = shoeHolder.rightSize();
            if (leftSize <= rightSize) {
                shoeHolder.changeNext(LEFT);
            } else {
                shoeHolder.changeNext(RIGHT);
            }
        }
    }
}
