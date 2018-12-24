package cn.augusto;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 */
@SpringBootApplication
@Component
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class);
  }
}
