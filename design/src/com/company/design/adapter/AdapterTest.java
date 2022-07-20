package com.company.design.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Hairdryer hairdryer = new Hairdryer();
        connect(hairdryer);

        Cleaner cleaner = new Cleaner();
        //connect(cleaner);

        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }
    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
