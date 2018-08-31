package cn.augusto.spdemo.aop;

import java.lang.annotation.*;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 17:50 2018/7/3
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAction {
  String name();
}
