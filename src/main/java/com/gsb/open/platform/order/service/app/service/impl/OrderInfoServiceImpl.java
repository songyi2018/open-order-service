package com.gsb.open.platform.order.service.app.service.impl;

import com.gsb.open.platform.order.service.protocol.protocol.IOrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 2020-2030 大数据 ALL Rights Reserved
 * @data 2020/11/24 22:12
 * Created by Sy
 */
@Slf4j
@Service(version = "${app.version}", timeout = 20000)
public class OrderInfoServiceImpl implements IOrderInfoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String createOrder() {
        System.out.println("创建订单成功被调用。。。。");
        this.jdbcTemplate.update("insert into orders(username) values ('张三')");
        return "创建订单成功。。。。。。";
    }
}
