package com.qjfcc.design.proxydesign.proxy;

import com.qjfcc.design.proxydesign.impl.IHouse;
import com.qjfcc.design.proxydesign.impl.ShangHaiHouse;

/**
 * @author 秦江峰
 * @AddTime 2020/1/17 11:29
 */
public class ShanghaiHouseProxy implements IHouse {

    private IHouse house = new ShangHaiHouse();


    @Override
    public void display() {
        this.house.display();
    }
}
