package cn.augusto.spdemo;


import cn.augusto.spdemo.conf.AugConfig;
import cn.augusto.spdemo.conf.ELConfig;
import cn.augusto.spdemo.conf.PrePostConfig;
import cn.augusto.spdemo.event.DemoPublisher;
import cn.augusto.spdemo.services.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpdemoApplication {
  
  public static void main(String[] args) {
//    ApplicationContext context = new ClassPathXmlApplicationContext(
//      "applicationContext.xml");
//    HelloWord obj = (HelloWord) context.getBean("helloBean");
//    obj.sayHello();
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AugConfig.class, PrePostConfig.class);
    UserFuncService service = context.getBean(UserFuncService.class);
    System.out.println(service.sayHello("nidaye"));
  
    System.out.println(context.getBean(UserFuncService.class).sayHello("ahhha"));
    System.out.println(context.getBean(UserFuncService.class).sayHello("ahhha2"));
  
    context.getBean(ThirdService.class).printInfo();
  
    DemoMethodService msvc = context.getBean(DemoMethodService.class);
    msvc.add();
  
    DemoAnnService asvc = context.getBean(DemoAnnService.class);
    asvc.add();
    ELConfig resourceService = context.getBean(ELConfig.class);
    resourceService.outputResource();
    BeanWayService bsvc = context.getBean(BeanWayService.class);
    JsrWayService jsvc = context.getBean(JsrWayService.class);
    DemoPublisher pub = context.getBean(DemoPublisher.class);
    pub.publish("nidayede");
    context.close();
  }
}
