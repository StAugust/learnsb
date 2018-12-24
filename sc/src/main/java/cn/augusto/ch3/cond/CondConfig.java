package cn.augusto.ch3.cond;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@ComponentScan("cn.augusto.ch3.cond")
@Configuration
public class CondConfig {
  @Bean
  @Conditional(WinCondition.class)
  public ListService getWinService(){
    return new WinListService();
  }

  @Bean
  @Conditional(LinuxCondition.class)
  public ListService getLinuxService(){
    return new LinuxListService();
  }
}
