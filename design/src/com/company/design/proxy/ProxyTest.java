package com.company.design.proxy;

import com.company.design.aop.AopBrowser;

import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicLong;

public class ProxyTest {
    public static void main(String[] args) {
        //여러번 호출시 매번 새로이 로딩
       /*
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        */

        //proxy pattern 사용
/*
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();
*/

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();



        IBrowser aopBorwser = new AopBrowser("www.google.com",
            ()->{
                System.out.println("before");
                start.set(System.currentTimeMillis());
            }
            ,()->{
                System.out.println("after");
                long now = System.currentTimeMillis();
                end.set(now- start.get());
        }
        );

        aopBorwser.show();
        System.out.println("loading time: "+end.get());

        aopBorwser.show();
        System.out.println("loading time: "+end.get());



    }
}
