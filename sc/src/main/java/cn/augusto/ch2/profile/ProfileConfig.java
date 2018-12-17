package cn.augusto.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ComponentScan("cn.augusto.ch2.profile")
@Configuration
public class ProfileConfig {

  @Bean
  @Profile("dev")
  public DemoBean demoBean(){
    return new DemoBean("dev");
  }

  @Bean
  @Profile("production")
  public DemoBean prodDemoBean(){
    return new DemoBean("production");
  }
}
