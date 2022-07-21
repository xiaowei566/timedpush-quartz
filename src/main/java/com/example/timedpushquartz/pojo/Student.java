package com.example.timedpushquartz.pojo;


import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @description: 实体类
 * @author: lvxw
 * @date: 2022/7/21 9:44
 */
@Data
@NacosConfigurationProperties(prefix = "student",dataId = "timedpush-quartz-dev.yaml",autoRefreshed = true)
@Component
public class Student {

    private String id;
    private String name;
}
