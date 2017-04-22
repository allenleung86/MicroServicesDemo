package com.kfit.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kfit.test.bean.Demo;

/**
 * Created by Allen on 2017/4/22 0022 上午 11:16.
 */

@RestController
@RequestMapping("/demo")
public class DemoController {
    /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angel");
        return demo;
    }
}