package com.gsb.open.platform.order.service.app.controller;

import com.gsb.open.platform.order.service.app.service.impl.OrderInfoServiceImpl;
import com.gsb.open.platform.order.service.protocol.protocol.IPayInfoService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2020-2030 大数据 ALL Rights Reserved
 * @data 2020/11/24 21:35
 * Created by Sy
 */
@RestController
@Slf4j
public class OrderController {
    @Reference(version = "${app.version}", check = false)
    IPayInfoService payInfoService;
//    在dubbo 2.7.8中注解
//    @Service被@DubboService 取代。
//    @Reference被@DubboReference取代。
//    估计是dubbo的开发团队考虑到，原来的注解和spring的原生注解重名了，为了在语言层面和spring的原生注解，有所以区别减少出错概率。

    @Autowired
    OrderInfoServiceImpl orderInfoService;

    /***
     * 调用provider服务的index方法
     * @return
     */
    @GetMapping("/index")
//    @GlobalTransactional(name = "create-order", rollbackFor = Exception.class)
    public String index() {
        String order = orderInfoService.createOrder();
        System.out.println(order);
        String pay = payInfoService.createPay();
        System.out.println(pay);

        return "ok";
    }

    /***
     * 调用provider服务的index方法
     * @return
     */
    @GetMapping("/index1")
    public String index1() {
        String order = orderInfoService.createOrder();
        System.out.println(order);
        return "ok";
    }
}
