package com.wangwei.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 微服务：
 *  把原先一个大的系统，拆分成一个个小的系统
 *  每个小系统分别开发、测试、维护。
 *
 *
 *  客户端调用方式：
 *     服务端提供什么形式的服务：rest服务(http)、webService、rpc
 *     对应的调用方式；rest--RestTemplate,httpclient.nutz
 *                   webService--CXF
 *                   rpc--专用的客户端调用方式
 *
 *  常见的注册中心：zookeeper、consul、etcd 、redis
 *  服务的提供方需要在服务启动的时候，将服务的信息(ip、port)注册到注册中心(zookeeper)
 *
 *  专业打包方式：appassembler-maven-plugin 插件
 *  官网：http://www.mojohaus.org/appassembler/appassembler-maven-plugin/index.html
 *  打包命令：mvn -D maven.test.skip=true clean package appassembler:assemble
 */
@SpringBootApplication
@MapperScan({"com.wangwei.mall.mapper"})
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);


    }
}
