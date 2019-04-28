package com.consumer;

import com.provider.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: provider
 * @Date: 2019/2/21 14:36
 */
public class XmlConsumer {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("consumer.xml");
        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.sayHello("dubbo"));
    }

}
