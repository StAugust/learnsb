package cn.augusto.ch2.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("cn.augusto.ch2.el")
@PropertySource("classpath:cn/augusto/ch2/el/test.properties")
public class ElConfig {
  @Value("why")
  private String why;
  @Value("#{systemProperties['os.name']}")
  private String osname;

  @Value("#{ T(java.lang.Math).random() * 100.0}")
  private double random;

  @Value("#{ demoService.another}")
  private String another;

  @Value("classpath:cn/augusto/ch2/el/test.txt")
  private Resource testFile;

  @Value("https://baidu.com")
  private Resource testUrl;

  @Value("${book.author}")
  private String bookname;

  @Autowired
  Environment environment;

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
    PropertySourcesPlaceholderConfigurer res = new PropertySourcesPlaceholderConfigurer();
    return res;
  }


  public void show(){
    System.out.println(why);
    System.out.println(osname);
    System.out.println(random);
    System.out.println(another);
    System.out.println(testFile);
    System.out.println(testUrl);
    System.out.println(bookname);
    System.out.println(environment.getProperty("book.name"));
  }


}
