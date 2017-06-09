package com.yunxi.drm.web.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用启动器
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: ApplicationStarter.java, v 0.1 2017年6月8日 下午4:00:36 leukony Exp $
 */
@MapperScan("com.yunxi.drm")
@ComponentScan("com.yunxi.drm")
@ServletComponentScan("com.yunxi.drm")
@SpringBootApplication
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}