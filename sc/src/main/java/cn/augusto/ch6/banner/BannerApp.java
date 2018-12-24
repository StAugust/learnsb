package cn.augusto.ch6.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerApp {


  public static void main(String[] args){
    SpringApplication app = new SpringApplication(BannerApp.class);
//    app.setBannerMode(Banner.Mode.OFF);

    SpringApplication.run(BannerApp.class);
  }
}
