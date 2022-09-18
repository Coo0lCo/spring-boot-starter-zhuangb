package scbc.lyj.zb.starter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import scbc.lyj.zb.starter.service.ZbService;

/**
 * @author LiYongJie
 * @date 2022/9/17 17:12
 */
@Configuration
@ConditionalOnClass(ZbService.class)
@EnableConfigurationProperties(ZbUserProperties.class)
public class ZbAutoConfiguration {

    private final ZbUserProperties zbUserProperties;

    public ZbAutoConfiguration(ZbUserProperties zbUserProperties) {
        this.zbUserProperties = zbUserProperties;
    }

    @Bean
    //双重条件：1.首先要开启装逼  2.然后只有当容器内无ZbService bean的情况下才实例化
    @ConditionalOnMissingBean(ZbService.class)

    @ConditionalOnProperty(prefix = "zb",value = "enable",havingValue = "false")
    public ZbService zbService(){
        return new ZbService(zbUserProperties.getName(),
                zbUserProperties.getAge(),
                zbUserProperties.getContent());
    }

}
