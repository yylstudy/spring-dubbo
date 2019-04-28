package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: provider
 * @Date: 2019/2/21 14:35
 */
public class XmlProvider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        System.in.read();
    }

}
