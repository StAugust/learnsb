package cn.augusto.ch4.smvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCtrl {
  @RequestMapping("/index")
  public String hello(){
    return "index";
  }
  @RequestMapping("/")
  public String root(){
    return "index";
  }
  @RequestMapping("/errors")
  public String error(){
    return "error";
  }
}
