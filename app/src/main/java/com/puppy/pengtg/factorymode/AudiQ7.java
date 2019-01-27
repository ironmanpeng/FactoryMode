package com.puppy.pengtg.factorymode;

public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("AudiQ7 启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("AudiQ7 开始巡航！");
    }
}
