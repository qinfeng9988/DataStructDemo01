package com.qjfcc.design.proxy;

/**
 * @author 秦江峰
 * 代理 beijiangHouse 类
 * @AddTime 2020/1/17 11:23
 */
public class BeijiangHouseProxy implements IHouse {

    private IHouse house = new BeijingHourse();


    @Override
    public void display() {
        this.house.display();
    }
}
