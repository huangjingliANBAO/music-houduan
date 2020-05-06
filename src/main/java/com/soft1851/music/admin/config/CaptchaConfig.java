package com.soft1851.music.admin.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/21
 */
@Configuration
public class CaptchaConfig {
    @Bean
    public DefaultKaptcha defaultKaptcha() {
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        //验证码长度
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        //有边框
        properties.setProperty("kaptcha.border", "yes");
        //边框色
        properties.setProperty("kaptcha.border.color", "252,180,180");
        //字体颜色
        properties.setProperty("kaptcha.textproducer.font.color", "40,44,52");
        //渐变色
        properties.setProperty("kaptcha.background.clear.from", "216,174,169");
        properties.setProperty("kaptcha.background.clear.to", "white");
        //字体大小
        properties.setProperty("kaptcha.textproducer.font.size", "28");
        //字体
        properties.setProperty("kaptcha.textproducer.font.names", "微软雅黑");
        //验证码图片大小
        properties.setProperty("kaptcha.image.width", "120");
        properties.setProperty("kaptcha.image.height", "45");
        //验证码保存的key
        properties.setProperty("kaptcha.session.key", "code");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
