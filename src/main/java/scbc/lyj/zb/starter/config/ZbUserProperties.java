package scbc.lyj.zb.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author LiYongJie
 * @date 2022/9/17 17:09
 */
@ConfigurationProperties(prefix = "zb.user")
public class ZbUserProperties {

    //装逼人名
    private String name;

    //装逼年龄
    private Integer age;

    //装什么b
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
