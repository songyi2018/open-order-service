package com.gsb.open.platform.order.service.app;

//import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author 2020-2030 大数据 ALL Rights Reserved
 * @data 2020/11/24 21:36
 * Created by Sy
 */
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String serverPort = environment.getProperty("user.name");

        System.out.printf("------------ 启动端口号: " + serverPort + " ------------\n");
    }

//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(new DataSourceProxy(dataSource));
//    }
}
