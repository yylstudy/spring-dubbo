package com.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.provider.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: provider
 * @Date: 2019/2/21 19:51
 */
public class JavaConsumer {
    public static void main(String[] args) throws Exception{
        //当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("hahha");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://172.18.150.129:2181");
        registryConfig.setUsername("aaa");
        registryConfig.setPassword("bbb");
        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<DemoService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(DemoService.class);
        referenceConfig.setVersion("1.0.0");
        List<MethodConfig> methods = new ArrayList<MethodConfig>();
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("sayHello");
        methodConfig.setTimeout(10000);
        methodConfig.setRetries(0);
        methods.add(methodConfig);
        referenceConfig.setMethods(methods);
        DemoService demoService = referenceConfig.get();
        System.out.println(demoService.sayHello("dubbo"));
    }
    
}
