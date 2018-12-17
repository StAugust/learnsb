package cn.augusto.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Profile {
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
//    context.getEnvironment().setActiveProfiles("production");
//    context.register(ProfileConfig.class);
//    context.refresh();
    DemoBean db = context.getBean(DemoBean.class);
    System.out.println(db.getContent());

    context.close();
  }
}
