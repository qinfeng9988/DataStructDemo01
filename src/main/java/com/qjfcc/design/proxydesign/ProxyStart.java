package com.qjfcc.design.proxydesign;

import com.qjfcc.design.proxydesign.proxy.BeijiangHouseProxy;
import com.qjfcc.design.proxydesign.proxy.ShanghaiHouseProxy;

/**
 * @author 秦江峰
 * 代理模式学习
 * @AddTime 2020/1/16 11:02
 */
public class ProxyStart {

    public static void main(String[] args) {

        //BeijiangHouseProxy 代理了BeijiangHouse类，隔离了调用方（当前main方法）与 BeijiangHouse 的直接依赖关系

        BeijiangHouseProxy bjProxy = new BeijiangHouseProxy();
        bjProxy.display();

        //ShanghaiHouseProxy 代理了ShanghaiHouse类，隔离了调用方（当前main方法）与ShanghaiHouse的直接依赖关系
        ShanghaiHouseProxy shProxy = new ShanghaiHouseProxy();
        shProxy.display();
    }
}
