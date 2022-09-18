package scbc.lyj.zb.starter.utils;

/**
 * @author LiYongJie
 * @date 2022/9/17 17:08
 */

public class ZbUtils {

    public static Boolean checkAge(Integer age){
        return age < 18 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static void doZb(String name,String context){
        System.out.println("name为:"+name+"的用户已成年,检查结束");
        System.out.println("装了个逼为:"+context);
    }

}
