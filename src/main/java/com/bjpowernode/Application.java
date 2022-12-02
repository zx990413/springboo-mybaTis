package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *使用@Mapperscan注解 将 basePackages中赋值目录的所有接口和xml文件都将扫描到
 * 解释: 找到Dao层接口和Mapper文件
 *      basePackages: Dao接口所在的包名
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.bjpowernode.dao","com.bjpowernode.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
