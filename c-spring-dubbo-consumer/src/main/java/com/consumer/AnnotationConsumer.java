package com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: provider
 * @Date: 2019/2/21 20:18
 */
public class AnnotationConsumer {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("annotation-consumer.xml");
        TestService testService = applicationContext.getBean(TestService.class);
        System.out.println(testService.sayHello());
    }

}
