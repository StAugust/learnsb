package cn.augusto.spdemo.conf;

import cn.augusto.spdemo.services.FunctionService;
import cn.augusto.spdemo.services.PureService;
import cn.augusto.spdemo.services.UsePureService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.jws.soap.SOAPBinding;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 14:24 2018/7/3
 */
@Configuration
@ComponentScan("cn.augusto.spdemo")
@EnableAspectJAutoProxy
public class AugConfig {
  @Bean
  public FunctionService functionService(){
    return new FunctionService();
  }
  
  @Bean
  public PureService pureService(){
    return new PureService();
  }
  @Bean
  public UsePureService usePureService(){
    UsePureService svc = new UsePureService();
    svc.setService(new PureService());
    return svc;
  }
  
  @Bean
  public UsePureService usePureService(PureService service){
    UsePureService svc = new UsePureService();
    svc.setService(service);
    return svc;
  }
  
}
