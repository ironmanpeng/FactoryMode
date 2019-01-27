package com.puppy.pengtg.factorymode;

public abstract class AudiCar {
    /*
    * 汽车的抽象产品类
    * 定义一个汽车的行为方法 车可以启动开走
    *
    * */
    public abstract  void drive();

    /*
    * 汽车的抽象产品类
    * 定义汽车的一个行为法法 车可以自动巡航
    *
    * */
    public abstract void selfNavigation();
}
