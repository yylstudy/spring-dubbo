package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: provider
 * @Date: 2019/2/21 20:05
 */
public class AnnotationProvider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("annotation-provider.xml");
        applicationContext.start();
        System.in.read();
    }

}
