package com.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.provider.service.AnnotationService;
import org.springframework.stereotype.Component;

/**
 * @Author: provider
 * @Date: 2019/2/21 20:18
 */
@Component
public class TestService {
    @Reference(version = "1.0.0")
    private AnnotationService annotationService;
    public String sayHello() throws Exception{
        return annotationService.sayHello("dubbo dubbo");
    }
}
