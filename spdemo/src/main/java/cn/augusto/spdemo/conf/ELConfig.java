package cn.augusto.spdemo.conf;

import cn.augusto.spdemo.services.DemoService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import sun.nio.ch.IOUtil;

/**
 * @Author: Augusto
 * @Description:
 * @Date: Created in 19:25 2018/7/3
 */
@Configuration
@ComponentScan("cn.augusto.spdemo")
@PropertySource("static/text.properties")
public class ELConfig {
  @Value("I love you")
  private String normal;
  
  @Value("#{systemProperties['os.name']}")
  private String osName;
  
  @Value("#{ T(java.lang.Math).random() * 100.00 }")
  private double randNum;
  
  @Value("#{demoService.another}")
  private String fromAnother;
  
  @Value("classpath:static/text.txt")
  private Resource txtFile;
  
  @Value("http://baidu.com")
  private Resource testUrl;
  
  @Value("${book.name}")
  private String bookName;
  
  @Value("${book.author}")
  private String bookAuthor;
  
  @Autowired
  private Environment env ;
  
  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
    return new PropertySourcesPlaceholderConfigurer();
  }
  
  
  public void outputResource(){
    try {
      System.out.println(normal);
      System.out.println(osName);
      System.out.println(randNum);
      System.out.println(fromAnother);
      System.out.println(IOUtils.toString(txtFile.getInputStream()));
      System.out.println(IOUtils.toString(testUrl.getInputStream()));
      System.out.println(bookName);
      System.out.println(env.getProperty("book.author"));
      
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
  
  
}
