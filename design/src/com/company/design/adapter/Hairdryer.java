package com.company.design.adapter;

public class Hairdryer implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("헤어 드라이어 110V on");
    }
}
