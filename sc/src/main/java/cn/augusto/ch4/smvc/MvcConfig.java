package cn.augusto.ch4.smvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("cn.augusto.ch4.smvc")
public class MvcConfig implements WebMvcConfigurer {
  @Bean
  public ViewResolver viewResolver() {
    UrlBasedViewResolver  solver = new UrlBasedViewResolver();
    solver.setPrefix("/WEB-INF/classes/views/");
    solver.setSuffix(".jsp");
    solver.setViewClass(JstlView.class);
    return solver;
  }

//  @Override
//  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//    configurer.enable();
//  }
}
