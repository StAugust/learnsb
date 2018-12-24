package cn.augusto.ch4.smvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Properties;

@SpringBootApplication
@ComponentScan("cn.augusto.ch4.smvc")
public class MainApp  implements WebApplicationInitializer{

   public static void main(String[] args) {
    SpringApplication app = new SpringApplication();
    Properties viewProp = new Properties();
    viewProp.setProperty("spring.mvc.view.prefix", "/WEB-INF/classes/views/");
    viewProp.setProperty("spring.mvc.view.suffix", ".jsp");
    app.setDefaultProperties(viewProp);
    app.run(MainApp.class);
  }

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(MvcConfig.class);
    context.setServletContext(servletContext);
    DispatcherServlet ds = new DispatcherServlet(context);
    ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherServlet", ds);
    servlet.addMapping(("/"));
    servlet.setLoadOnStartup(1);
  }
}
