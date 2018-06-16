package cn.augusto.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 15:44 2018/6/14
 */
public class Main {
  
  public static void main(String[] args){
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
    AwareService service = context.getBean(AwareService.class);
    service.outputResult();
  }
}
