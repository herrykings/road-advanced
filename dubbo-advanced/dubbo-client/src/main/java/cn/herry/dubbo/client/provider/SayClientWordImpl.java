package cn.herry.dubbo.client.provider;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author caoheng
 * @className SayClientWordImpl
 * @date 2022/08/29
 **/
@DubboService
public class SayClientWordImpl implements SayClientWord {
    @Override
    public String sayWord(String msg) {
        return "hello";
    }
}
