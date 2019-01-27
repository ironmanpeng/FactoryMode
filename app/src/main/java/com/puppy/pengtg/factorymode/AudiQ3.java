package com.puppy.pengtg.factorymode;

public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("AudiQ3 启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("AudioQ3 开始巡航！");
    }
}
