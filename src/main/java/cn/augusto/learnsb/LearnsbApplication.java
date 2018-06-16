package cn.augusto.learnsb;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class LearnsbApplication {
  
  @RequestMapping(path = {"/test"})
  String index() {
    return "Greetings, my lord";
  }
  
  public static void main(String[] args) {
//		SpringApplication.run(LearnsbApplication.class, args);
    
    List<String> list = JSON.parseArray("[]", String.class);
    System.out.println(list);
  }
}
