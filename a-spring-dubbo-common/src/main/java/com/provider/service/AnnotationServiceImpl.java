package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Author: provider
 * @Date: 2019/2/21 20:05
 */
@Service(version = "1.0.0")
public class AnnotationServiceImpl implements AnnotationService{
    public String sayHello(String name) throws Exception {
        return "hello "+name;
    }
}
