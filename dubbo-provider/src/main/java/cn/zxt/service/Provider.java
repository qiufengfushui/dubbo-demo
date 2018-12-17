package cn.zxt.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class Provider {
    public static void main(String[] args) {
        /*com.alibaba.dubbo.container.Main.main(args);*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ":here");
        context.start();
        try {
            System.in.read();   
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
