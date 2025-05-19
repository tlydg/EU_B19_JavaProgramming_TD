package day42_staticMemebers;

public class C02_Count {

    static int instanceCounter=0;

    C02_Count (){
        instanceCounter ++;
    }

    public int getInstanceCounter(){
        return  instanceCounter;
    }
}
