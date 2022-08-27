package cn.herry.dubbo.client.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caoheng
 * @className SayHelloController
 * @date 2022/08/21
 **/
@RestController
@RequestMapping(value = "/sayHello")
public class SayHelloController {

    @DubboReference
    private SayHello sayHello;

    @GetMapping
    public Object say(){
        Map<String,String> map = new HashMap<>(1);
        map.put("msg", sayHello.say("你好"));
        return map;
    }

}
