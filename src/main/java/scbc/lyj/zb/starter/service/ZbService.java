package scbc.lyj.zb.starter.service;

import scbc.lyj.zb.starter.utils.ZbUtils;

/**
 * @author LiYongJie
 * @date 2022/9/17 17:11
 */

public class ZbService {

    //装逼人名
    private String name;

    //装逼年龄
    private Integer age;

    //装什么b
    private String content;

    public ZbService(String name, Integer age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void zb(){
        if (ZbUtils.checkAge(age)){
            ZbUtils.doZb(name,content);
        }else {
            System.out.println("用户名为:"+name+"装逼失败,你好像未成年！！！");
        }
    }

}
