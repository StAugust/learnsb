package cn.augusto.ch6.confproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PropertiesConfig {

  @Value("${book.name}")
  private String bookName;
  public void setBookName(String bn){
    bookName = bn;
  }

  public String getBookName(){
    return bookName;
  }

  @RequestMapping("/")
  String index(){
    return bookName;
  }
  public static void main(String[] args){
    SpringApplication.run(PropertiesConfig.class);
  }
}
