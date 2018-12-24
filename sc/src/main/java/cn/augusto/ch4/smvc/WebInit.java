package cn.augusto.ch4.smvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
//
//public class WebInit implements WebApplicationInitializer {
//  @Override
//  public void onStartup(ServletContext servletContext) {
//    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//    context.register(MvcConfig.class);
//    context.setServletContext(servletContext);
//    DispatcherServlet ds = new DispatcherServlet(context);
//
//    ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherServlet", ds);
//    servlet.addMapping(("/"));
//    servlet.setLoadOnStartup(1);
//  }
//}
