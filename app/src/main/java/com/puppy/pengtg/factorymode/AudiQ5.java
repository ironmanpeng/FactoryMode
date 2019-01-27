package com.puppy.pengtg.factorymode;

public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("AudiQ5启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("AudiQ5 开始巡航！");
    }
}
