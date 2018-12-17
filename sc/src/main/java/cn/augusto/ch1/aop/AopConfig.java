package cn.augusto.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.augusto.ch1.aop")
@EnableAspectJAutoProxy //let sprint support aspectj
public class AopConfig {
}
