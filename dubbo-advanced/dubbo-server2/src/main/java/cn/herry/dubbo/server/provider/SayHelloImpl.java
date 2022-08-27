package cn.herry.dubbo.server.provider;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author caoheng
 * @className SayHelloImpl
 * @date 2022/08/21
 **/
@DubboService(group = "DEFAULT_GROUP")
public class SayHelloImpl implements SayHello {

    @Override
    public String say(String msg) {
        System.out.println("receive client msg :" + msg);
        return "hi,hello";
    }
}
