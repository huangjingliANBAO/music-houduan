package com.soft1851.music.admin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName ExcelVoAttribute
 * @Description 自定义注解，封装Excel导出需求，可根据实际需求扩展
 * @Author yhChen
 * @Description
 * @Date 2020/4/28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelVoAttribute {
    /**
     * 导出到Excel的列名
     *
     * @return
     */
    public abstract String name();

    /**
     * 配置列的展现顺序，如A(0),B(1)
     *
     * @return
     */
    public abstract int column();

    /**
     * 是否需要数字格式展示
     *
     * @return
     */
    public abstract boolean isNumber() default false;

    /**
     * 是否需要日期时间格式展示
     * @return
     */
    public abstract  boolean isDateTime() default  false;
}
