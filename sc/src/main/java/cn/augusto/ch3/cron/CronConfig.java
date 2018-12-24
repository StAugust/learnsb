package cn.augusto.ch3.cron;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@ComponentScan("cn.augusto.ch3.cron")
@Component
@EnableScheduling
public class CronConfig {

}
