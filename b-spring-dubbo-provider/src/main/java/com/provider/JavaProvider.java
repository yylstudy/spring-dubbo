package com.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.provider.service.DemoService;
import com.provider.service.DemoServiceImpl;

/**
 * @Author: provider
 * @Date: 2019/2/21 19:39
 */
public class JavaProvider {
    public static void main(String[] args) throws Exception{
        //创建一个服务实现
        DemoService demoService = new DemoServiceImpl();
        //当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("hello-server");
        //连接注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://172.18.150.129:2181");
        registryConfig.setUsername("aaa");
        registryConfig.setPassword("bbb");
        //服务提供者协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(28000);
        //服务提供者暴露服务配置
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<DemoService>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setRef(demoService);
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setVersion("1.0.0");
        //暴露服务及注册服务
        serviceConfig.export();
        System.in.read();

    }
}
