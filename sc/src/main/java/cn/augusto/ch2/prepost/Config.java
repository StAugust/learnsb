package cn.augusto.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("cn.augusto.ch2.prepost")
@Configuration
public class Config {

  @Bean(initMethod = "init", destroyMethod = "preDes")
  public BeanService beanService(){
    return new BeanService();
  }

  @Bean
  public JsrService jsrService(){
    return new JsrService();
  }
}
