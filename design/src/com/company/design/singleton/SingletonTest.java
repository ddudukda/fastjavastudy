package com.company.design.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        AClazz aclazz = new AClazz();
        BClazz bclazz = new BClazz();

        SocketClient aclient = aclazz.getSocketClient();
        SocketClient bclient = bclazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aclient.equals(bclient));
    }
}
