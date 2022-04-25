package com.jhost.template.Face.config;

import com.jhost.template.Face.bean.ApplicationEnvironment;
import lombok.Getter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@EnableConfigurationProperties({CoreConfigurationProperties.class, FaceConfigurationProperties.class})
@Configuration
public class ConfigBean {
    private final ApplicationEnvironment env;
    private final String coreUrl;

    public ConfigBean(
            CoreConfigurationProperties coreConfigurationProperties,
            FaceConfigurationProperties faceConfigurationProperties
    ){
        this.env = ApplicationEnvironment.fromString(faceConfigurationProperties.getEnv());
        this.coreUrl = coreConfigurationProperties.getUrl();
    }
}
