package cn.augusto.websockexpl;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ViewCtrl implements WebMvcConfigurer {
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/ws").setViewName("/ws");
    registry.addViewController("/chat").setViewName("/chat");
    registry.addViewController("/login").setViewName("/login");
    registry.addViewController("/fuck").setViewName("/fuck");
  }
}
