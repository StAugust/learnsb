package cn.augusto.ch5.ctrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ControllerApp {
  @RequestMapping("/")
  String index(){
    return "Hello, spring boot";
  }
  public static void main(String[] args){
    SpringApplication.run(ControllerApp.class);
  }
}
