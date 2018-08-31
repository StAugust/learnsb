package cn.augusto.spdemo.conf;

import cn.augusto.spdemo.services.BeanWayService;
import cn.augusto.spdemo.services.JsrWayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 19:43 2018/7/3
 */
@Configuration
public class PrePostConfig {
  @Bean(initMethod="init", destroyMethod="destroy")
  public BeanWayService getBeanWayService(){
    return new BeanWayService();
  }
  
  @Bean
  public JsrWayService getJsrWayService(){
    return new JsrWayService();
  }
  
}
